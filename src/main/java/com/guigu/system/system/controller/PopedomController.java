package com.guigu.system.system.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.construct.service.DepartmentService;
import com.guigu.system.po.Admin;
import com.guigu.system.po.AdminPopedom;
import com.guigu.system.po.Department;
import com.guigu.system.po.PopedomVO;
import com.guigu.system.system.service.AdminService;
import com.guigu.system.system.service.PopedomVOService;

@Controller
@RequestMapping("/system/adminpopedom/")
public class PopedomController {
	@Resource(name="popedomVOServiceImpl")
	private  PopedomVOService popedomVOService;
	@Resource(name="departmentServiceImpl")
	private DepartmentService departmentService;
	@Resource(name="adminServiceImpl")
	private AdminService adminService;
	
	@RequestMapping("list.action")
	public String list(PopedomVO popedomVO,Model model) {
		if(popedomVO!=null) {
			if(popedomVO.getAdminName()!=null) {
				popedomVO.setAdminName("%"+popedomVO.getAdminName()+"%");
			}
			if(popedomVO.getDepartmentName()!=null) {
				popedomVO.setDepartmentName("%"+popedomVO.getDepartmentName()+"%");
			}
		}
		List<PopedomVO> list=popedomVOService.findList(popedomVO);
		model.addAttribute("list", list);
		return "system/adminpopedom/adminpopedom_list";
	}
	@RequestMapping("add.action")
	public String add(Model model,@Validated PopedomVO popedomVO,BindingResult bindingResult) {
		System.out.println(popedomVO.getAdminId());
		System.out.println(popedomVO.getDepartmentId());
		if(bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors",allErrors);
			model.addAttribute("popedomVO",popedomVO);
			return "system/adminpopedom/adminpopedom_add";
		}
		boolean result=popedomVOService.save(popedomVO);
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
		List<Admin> list2=adminService.findList(null);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		return "system/adminpopedom/adminpopedom_add";
	}
	
	@RequestMapping("delete.action")
    public String delete(Integer popedomId,Model model) {
        boolean result =popedomVOService.delete(popedomId);
        if(result) {
            model.addAttribute("info", "删除成功");
        }else {
            model.addAttribute("info", "删除失败");
        }
        return this.list(null, model);
    }
	
	@RequestMapping("load.action")
    public String load(Integer popedomId,Model model) {
    	PopedomVO popedomVO=popedomVOService.findOne(popedomId);
        model.addAttribute("popedomVO", popedomVO);
        return this.beforeupdate(model);
    }
	
	
	@RequestMapping("beforeupdate.action")
	public String beforeupdate(Model model) {
		List<Department> list=departmentService.findList(null);
		List<Admin> list2=adminService.findList(null);
		model.addAttribute("list", list);
		model.addAttribute("list2", list2);
		return "system/adminpopedom/adminpopedom_update";
	}
	
	@RequestMapping("update.action")
    public String update(Model model,@Validated PopedomVO popedomVO,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("popedomVO", popedomVO);
			return "system/adminPopedom/adminPopedom_update";
		}
    	boolean result=popedomVOService.update(popedomVO);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }

}
