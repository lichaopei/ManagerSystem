package com.guigu.system.order.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.order.service.OrderVOService;
import com.guigu.system.order.service.PhotoTypeService;
import com.guigu.system.po.EmployeesVO;
import com.guigu.system.po.OrderVO;
import com.guigu.system.po.Orders;
import com.guigu.system.po.PhotoType;
@Controller
@RequestMapping("/order/order/")
public class OrderVOController {
	@Resource(name="orderVOserviceImpl")
	private OrderVOService orderVOService;
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService eService;
	@Resource(name="photoTypeServiceImpl")
	private PhotoTypeService pService;
	private EmployeesVO employeesVO=new EmployeesVO(); 
	private PhotoType photoType=new PhotoType();
	
	@RequestMapping("list.action")
	public String list(OrderVO orderVO,Model model,HttpSession session) {
		List<OrderVO> list=orderVOService.findList(orderVO);
		model.addAttribute("admin", session.getAttribute("admin"));
		model.addAttribute("list", list);
		return "/order/order/order_list";
	}
	
	@RequestMapping("beforeAdd.action")
	public String beforeAdd(Model model) {
		employeesVO.setDepartment(1);
		List<PhotoType> type=pService.findList(null);
		List<EmployeesVO> floor=eService.findEmployees(employeesVO);
		model.addAttribute("floor",floor);
		model.addAttribute("types", type);
		return "order/order/order_add";
	}
	
	@RequestMapping("add.action")
	public String add(Model model, Orders order,HttpSession session) {
		order.setFrontCost(pService.findOne(order.getTypeId()).getCost());
		order.setFlag("否");
		boolean result= orderVOService.save(order);
	       if(result) {
	           model.addAttribute("info","添加成功");
	       }else {
	           model.addAttribute("info","添加失败");
	       }
	       return this.list(null,model,session);
	}
	
	@RequestMapping("load.action")
    public String load(Integer orderId,Model model) {
		OrderVO orderVO=orderVOService.findOne(orderId);
        model.addAttribute("order", orderVO);
        List<PhotoType> type=pService.findList(null);
        model.addAttribute("types", type);
        employeesVO.setDepartment(1);
		List<EmployeesVO> floor=eService.findEmployees(employeesVO);
		employeesVO.setDepartment(2);
		List<EmployeesVO> makeUp=eService.findEmployees(employeesVO);
		employeesVO.setDepartment(3);
		List<EmployeesVO> photo=eService.findEmployees(employeesVO);
		employeesVO.setDepartment(4);
		List<EmployeesVO> ps=eService.findEmployees(employeesVO);
		employeesVO.setDepartment(5);
		List<EmployeesVO> choose=eService.findEmployees(employeesVO);
		model.addAttribute("floor", floor);
		model.addAttribute("makeUp", makeUp);
		model.addAttribute("photo", photo);
		model.addAttribute("ps", ps);
		model.addAttribute("choose", choose);
		return "order/order/order_update";
    }
	
	@RequestMapping("update.action")
	public String update(Orders order,Model model,HttpSession session) {
		boolean result=orderVOService.update(order);
		 if(result) {
	           model.addAttribute("info","更新成功");
	       }else {
	           model.addAttribute("info","更新失败");
	       }
		return this.list(null, model,session);
	}
	
	@RequestMapping("delete.action")
	public String delete(int orderId,Model model,HttpSession session) {
		  boolean result =orderVOService.delete(orderId);
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }else {
	            model.addAttribute("info", "删除失败");
	        }
	        return this.list(null, model,session);
	}
	@RequestMapping("show")
	public String show(int orderId,Model model) {
		OrderVO orderVO=orderVOService.findOne(orderId);
		model.addAttribute("order",orderVO);
		return "order/order/order_show";
	}
}
