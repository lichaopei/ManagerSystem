package com.guigu.system.JfreeChart;

import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.guigu.system.po.mapper.OrderVOMapper;

/**
 * 该类生成柱状图
 * @author 小郑
 */
@Controller 
public class ChartController{
	
	@Resource(name="orderVOMapper")
	private  OrderVOMapper orderVOMapper; 
	
    @RequestMapping(value = "/getMajorChart")
    public ModelAndView getMajorChart(HttpServletRequest request,
            HttpServletResponse response, ModelMap modelMap) throws Exception{
        CategoryDataset dataset = getDataSet2();
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);  
        
        JFreeChart chart = ChartFactory.createBarChart3D(year+"年订单成交金额", // 图表标题
                "时间", // 目录轴的显示标签
                "金额", // 数值轴的显示标签
                dataset, // 数据集
                PlotOrientation.VERTICAL, // 图表方向：水平、垂直
                true, // 是否显示图例(对于简单的柱状图必须是false)
                true, // 是否生成工具
                false // 是否生成URL链接
                );
        //解决乱码问题
         getChartByFont(chart);
        String fileName = ServletUtilities.saveChartAsJPEG(chart, 1000, 500, null, request.getSession());
        String chartURL=request.getContextPath() + "/DisplayChart/Chart?filename="+fileName;
        modelMap.put("chartURL", chartURL);
        return new ModelAndView("bootm",modelMap);
    }
    private static void getChartByFont(JFreeChart chart) {
        TextTitle textTitle = chart.getTitle();   
            textTitle.setFont(new Font("宋体",Font.BOLD,20));
            LegendTitle legend = chart.getLegend();   
            if (legend!=null) {   
            legend.setItemFont(new Font("宋体", Font.BOLD, 20));   
            }
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            CategoryAxis axis = plot.getDomainAxis();
                //设置X轴坐标上标题的文字
                axis.setLabelFont(new Font("宋体",Font.BOLD,22));
                //设置X轴坐标上的文字，
                axis.setTickLabelFont(new Font("宋体",Font.BOLD,12));
           
                ValueAxis valueAxis = plot.getRangeAxis();
                //设置Y轴坐标上标题的文字
                valueAxis.setLabelFont(new Font("宋体",Font.BOLD,12));
                //设置Y轴坐标上的文字
                valueAxis.setTickLabelFont(new Font("sans-serif",Font.BOLD,12));
                BarRenderer3D   renderer   =   new   BarRenderer3D(); 
            
                renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator()); 
                renderer.setBaseItemLabelsVisible(true); 
                plot.setRenderer(renderer); 
    }

    /**
     * 获取一个演示用的组合数据集对象
     *
     * @return
     */
    private  CategoryDataset getDataSet2() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        String[] date=orderVOMapper.date(year+"%");
        double[] money=new double[date.length];
        for (int i = 0; i < date.length; i++) {
			money[i]=orderVOMapper.countMoney(year+"-"+date[i]+"%");
		}
        for (int i = 0; i < money.length; i++) {
			dataset.addValue(money[i], "金额", date[i]);
		}
        return dataset;
    }
}