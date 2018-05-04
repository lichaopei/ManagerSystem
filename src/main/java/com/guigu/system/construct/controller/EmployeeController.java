package com.guigu.system.construct.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.construct.service.DepartmentService;
import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.construct.service.PositionService;
import com.guigu.system.po.Department;
import com.guigu.system.po.EmployeesVO;
import com.guigu.system.po.Position;

@Controller
@RequestMapping("/construct/employee/")
public class EmployeeController {
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService employeeVOService;
	
	@Resource(name="departmentServiceImpl")
	private DepartmentService departmentService;
	
	@Resource(name="positionServiceImpl")
	private PositionService positionService;
	
	@RequestMapping("list.action")
	public String list(EmployeesVO employeesVO,Model model) {
		List<EmployeesVO> list=employeeVOService.findEmployees(employeesVO);
		model.addAttribute("list", list);
		return "construct/employee/employee_list";
	}
	@RequestMapping("add.action")
	public String add(Model model,EmployeesVO employeesVO) {
		boolean result=employeeVOService.save(employeesVO);
		if(result) {
	        model.addAttribute("info","添加成功");
	    }else {
	        model.addAttribute("info","添加失败");
	    }
	    return this.list(null, model);
	}
	@RequestMapping("beforeadd.action")
	public String before(Model model) {
		List<Department> list=departmentService.findList(null);
		List<Position> list2=positionService.findList(null);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		return "construct/employee/employee_add";
	}
	@RequestMapping("delete.action")
    public String delete(Integer employeeId,Model model) {
        boolean result =employeeVOService.delete(employeeId);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	@RequestMapping("load.action")
    public String load(Integer employeeId,Model model) {
		EmployeesVO employeesVO =employeeVOService.findOne(employeeId);
        model.addAttribute("employeeVO", employeesVO);
        return this.beforeupdate(model);
    }
	@RequestMapping("beforeupdate.action")
	public String beforeupdate(Model model) {
		List<Department> list=departmentService.findList(null);
		List<Position> list2=positionService.findList(null);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		return "construct/employee/employee_update";
	}
	@RequestMapping("update.action")
    public String update(Model model, EmployeesVO employeesVO) {
		
    	boolean result=employeeVOService.update(employeesVO);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("show")
	public String show(Model model,Integer employeeId) {
		EmployeesVO eVo=employeeVOService.findOne(employeeId);
		model.addAttribute("employeeVO", eVo);
		return "construct/employee/employee_show";
	}
	
}
