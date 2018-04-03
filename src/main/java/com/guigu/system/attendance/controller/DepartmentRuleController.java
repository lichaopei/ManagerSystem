package com.guigu.system.attendance.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.attendance.service.DepartmentRuleVOService;
import com.guigu.system.construct.service.DepartmentService;
import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.converter.Transfor;
import com.guigu.system.po.AttendanceRule;
import com.guigu.system.po.Department;
import com.guigu.system.po.DepartmentRuleVO;
import com.mchange.v2.sql.filter.SynchronizedFilterDataSource;

@Controller
@RequestMapping("/attendance/departmentrule/")
public class DepartmentRuleController {
	@Resource(name="departmentRuleVOServiceImpl")
	private DepartmentRuleVOService departmentRuleVOService;
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService employeeVOService;
	@Resource(name="departmentServiceImpl")
	private DepartmentService departmentService;
	
	@RequestMapping("list.action")
	public String list(DepartmentRuleVO departmentRuleVO,Model model) {
		List<DepartmentRuleVO> list=departmentRuleVOService.findList(departmentRuleVO);
		model.addAttribute("list", list);
		return "/attendance/departmentrule/departmentrule_list";
	}
	
	
	@RequestMapping("before.action")
	public String beforeAdd(Model model) {
		List<Department> list=departmentService.findOther();
		model.addAttribute("findlist", list);
		return "/attendance/departmentrule/departmentrule_add";
	}
	
	@RequestMapping("add.action")
    public String addTemplate(Model model,@Validated DepartmentRuleVO departmentRuleVO,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("department", departmentRuleVO);
			return "/attendance/departmentrule/departmentrule_add";
		}
		boolean result= departmentRuleVOService.save(departmentRuleVO);
       if(result) {
           model.addAttribute("info","添加成功");
       }else {
           model.addAttribute("info","添加失败");
       }
       return this.list(null, model);
       
    }
	@RequestMapping("load.action")
    public String load(Integer ruleId,Model model) {
		DepartmentRuleVO departmentRule=departmentRuleVOService.findOne(ruleId);
        model.addAttribute("department", departmentRule);
        return "attendance/departmentrule/departmentrule_update";
    }
	
	@RequestMapping("update.action")
    public String update(Model model,@Validated DepartmentRuleVO departmentRuleVO,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("department", departmentRuleVO);
			return "attendance/departmentrule/departmentrule_update";
		}
		AttendanceRule  attendanceRule=departmentRuleVO;
    	boolean result=departmentRuleVOService.update(attendanceRule);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	 @RequestMapping("delete.action")
	    public String delete(Integer ruleId,Model model) {
	        boolean result =departmentRuleVOService.delete(ruleId);
	        
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }else {
	            model.addAttribute("info", "删除失败");
	        }
	        return this.list(null, model);
	    }

}
