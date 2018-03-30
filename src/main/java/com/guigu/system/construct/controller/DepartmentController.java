package com.guigu.system.construct.controller;

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
import com.guigu.system.po.Department;

@Controller
@RequestMapping("/construct/department/")
public class DepartmentController {
	@Resource(name="departmentServiceImpl")
	private DepartmentService departmentService;
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService employeeVOService;
	
	@RequestMapping("list.action")
	public String list(Department department,Model model) {
		List<Department> list=departmentService.findList(department);
		model.addAttribute("list", list);
		return "/construct/department/department_list";
	}
	
	@RequestMapping("add.action")
    public String addTemplate(Model model,@Validated Department department,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("department", department);
			return "/construct/department/department_add";
		}
		department.setEmpNumber(0);
		boolean result= departmentService.save(department);
       if(result) {
           model.addAttribute("info","添加成功");
       }else {
           model.addAttribute("info","添加失败");
       }
       return this.list(null, model);
       
    }
	@RequestMapping("load.action")
    public String load(Integer departmentId,Model model) {
	
    	Department department=departmentService.findOne(departmentId);
        model.addAttribute("department", department);
        return "construct/department/department_update";
    }
	
	@RequestMapping("update.action")
    public String update(Model model,@Validated Department department,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("department", department);
			return "construct/department/department_update";
		}
    	boolean result=departmentService.update(department);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	 @RequestMapping("delete.action")
	    public String delete(Integer departmentId,Model model) {
	        boolean result =departmentService.delete(departmentId);
	        
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }else {
	            model.addAttribute("info", "删除失败");
	        }
	        return this.list(null, model);
	    }

}
