package com.guigu.system.attendance.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.attendance.service.DepartmentRuleVOService;
import com.guigu.system.construct.service.DepartmentService;
import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.po.AttendanceRule;
import com.guigu.system.po.Department;
import com.guigu.system.po.DepartmentRuleVO;

@Controller
@RequestMapping("/attendance/departmentrule/")
public class DepartmentRuleController {
	@Resource(name="departmentRuleVOService")
	private DepartmentRuleVOService departmentRuleVOService;
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService employeeVOService;
	
	@RequestMapping("list.action")
	public String list(DepartmentRuleVO departmentRuleVO,Model model) {
		List<DepartmentRuleVO> list=departmentRuleVOService.findList(departmentRuleVO);
		model.addAttribute("list", list);
		return "/attendance/departmentrule/departmentrule_list";
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
	
		AttendanceRule departmentRule=departmentRuleVOService.findOne(ruleId);
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
    	boolean result=departmentRuleVOService.update(departmentRuleVO);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	 @RequestMapping("delete.action")
	    public String delete(Integer departmentId,Model model) {
	        boolean result =departmentRuleVOService.delete(departmentId);
	        
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }else {
	            model.addAttribute("info", "删除失败");
	        }
	        return this.list(null, model);
	    }

}
