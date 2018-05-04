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
 * ����������״ͼ
 * @author С֣
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
        
        JFreeChart chart = ChartFactory.createBarChart3D(year+"�궩���ɽ����", // ͼ�����
                "ʱ��", // Ŀ¼�����ʾ��ǩ
                "���", // ��ֵ�����ʾ��ǩ
                dataset, // ���ݼ�
                PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
                true, // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
                true, // �Ƿ����ɹ���
                false // �Ƿ�����URL����
                );
        //�����������
         getChartByFont(chart);
        String fileName = ServletUtilities.saveChartAsJPEG(chart, 1000, 500, null, request.getSession());
        String chartURL=request.getContextPath() + "/DisplayChart/Chart?filename="+fileName;
        modelMap.put("chartURL", chartURL);
        return new ModelAndView("bootm",modelMap);
    }
    private static void getChartByFont(JFreeChart chart) {
        TextTitle textTitle = chart.getTitle();   
            textTitle.setFont(new Font("����",Font.BOLD,20));
            LegendTitle legend = chart.getLegend();   
            if (legend!=null) {   
            legend.setItemFont(new Font("����", Font.BOLD, 20));   
            }
            CategoryPlot plot = (CategoryPlot) chart.getPlot();
            CategoryAxis axis = plot.getDomainAxis();
                //����X�������ϱ��������
                axis.setLabelFont(new Font("����",Font.BOLD,22));
                //����X�������ϵ����֣�
                axis.setTickLabelFont(new Font("����",Font.BOLD,12));
           
                ValueAxis valueAxis = plot.getRangeAxis();
                //����Y�������ϱ��������
                valueAxis.setLabelFont(new Font("����",Font.BOLD,12));
                //����Y�������ϵ�����
                valueAxis.setTickLabelFont(new Font("sans-serif",Font.BOLD,12));
                BarRenderer3D   renderer   =   new   BarRenderer3D(); 
            
                renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator()); 
                renderer.setBaseItemLabelsVisible(true); 
                plot.setRenderer(renderer); 
    }

    /**
     * ��ȡһ����ʾ�õ�������ݼ�����
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
			dataset.addValue(money[i], "���", date[i]);
		}
        return dataset;
    }
}