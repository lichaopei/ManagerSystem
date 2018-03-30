package com.guigu.system.system.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.po.Admin;
import com.guigu.system.system.service.AdminService;
@Controller
@RequestMapping("/system/admin/")
public class AdminController {
	@Resource(name="adminServiceImpl")
	private AdminService adminService;
	
	@RequestMapping("list.action")
	public String list(Admin admin,Model model) {
		List<Admin> list=adminService.findList(admin);
		model.addAttribute("list", list);
		return "system/admin/admin_list";
	}
	
	@RequestMapping("add.action")
    public String add(Model model,@Validated Admin admin,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("admin", admin);
			return "system/admin/admin_add";
		}
		boolean result=adminService.save(admin);
       if(result) {
           model.addAttribute("info","Ìí¼Ó³É¹¦");
       }else {
           model.addAttribute("info","Ìí¼ÓÊ§°Ü");
       }
       return this.list(null, model);
       
    }
	@RequestMapping("load.action")
    public String load(Integer adminid,Model model) {
    	Admin admin=adminService.findOne(adminid);
        model.addAttribute("admin", admin);
        return "system/admin/admin_update";
    }
	
	@RequestMapping("update.action")
    public String update(Model model,@Validated Admin admin,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("admin", admin);
			return "system/admin/admin_update";
		}
    	boolean result=adminService.update(admin);
        if(result) {
            model.addAttribute("info", "ÐÞ¸Ä³É¹¦");
        }else {
            model.addAttribute("info", "ÐÞ¸ÄÊ§°Ü");
        }
        return this.list(null, model);
    }
	
	 @RequestMapping("delete.action")
	    public String delete(Integer adminid,Model model) {
	        boolean result =adminService.delete(adminid);
	        
	        if(result) {
	            model.addAttribute("info", "É¾³ý³É¹¦");
	        }else {
	            model.addAttribute("info", "É¾³ýÊ§°Ü");
	        }
	        return this.list(null, model);
	   }
	 
	 @RequestMapping("login.action")
	 public String login(Admin admin,HttpSession session,Model model) {
		 session.setAttribute("adminname", admin.getAdminAccount());  
		 Admin loginadmin=adminService.login(admin);
		 if (loginadmin==null || loginadmin.getAdminState().equals("·ñ")) {
			model.addAttribute("error", "µÇÂ¼Ê§°Ü");
			model.addAttribute("admin", admin);
			return "login";
		 }
		 model.addAttribute("loginadmin", loginadmin);
		 return "index";
	 }

}
