package com.guigu.system.system.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.omg.PortableServer.ServantActivator;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.po.Admin;
import com.guigu.system.po.mapper.PopedomVOMapper;
import com.guigu.system.system.service.AdminService;
import com.guigu.system.system.service.PopedomVOService;
@Controller
@RequestMapping("/system/admin/")
public class AdminController {
	private  Admin admin;
	
	@Resource(name="adminServiceImpl")
	private AdminService adminService;
	
	@Resource(name="popedomVOMapper")
	private PopedomVOMapper popedomVOMapper;
	
	@RequestMapping("list.action")
	public String list(Admin admin,Model model) {
		List<Admin> list=adminService.findList(admin);
		model.addAttribute("list", list);
		return "system/admin/admin_list";
	}
	
	@RequestMapping("add.action")
    public String add(Model model, Admin admin) {
		
		boolean result=adminService.save(admin);
       if(result) {
           model.addAttribute("info","添加成功");
       }else {
           model.addAttribute("info","添加失败");
       }
       return this.list(null, model);
       
    }
	@RequestMapping("load.action")
    public String load(Integer adminId,Model model) {
    	admin=adminService.findOne(adminId);
        model.addAttribute("admin", admin);
        return "system/admin/admin_update";
    }
	
	@RequestMapping("update.action")
    public String update(Model model,Admin admin) {
		if ("否".equals(admin.getAdminState()) && "是".equals(admin.getAdminRight())) {
			model.addAttribute("allErrors", "超级管理员不能被禁用！");
			model.addAttribute("admin", admin);
			return "system/admin/admin_update";
		}
    	boolean result=adminService.update(admin);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
    }
	
	 @RequestMapping("delete.action")
	    public String delete(Integer adminId,Model model) {
		 	Admin admin=adminService.findOne(adminId);
		 	if("是".equals(admin.getAdminRight())) {
		 		 model.addAttribute("info", "管理员不能被删除");
		 		  return this.list(null, model);
		 	}
		 	int i=popedomVOMapper.findCount(adminId);
		 	if(i>0) {
		 		model.addAttribute("info", "该用户与部门有绑定，不能删除！");
		 		return this.list(null, model);
		 		
		 	}
	        boolean result =adminService.delete(adminId);
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }
	        return this.list(null, model);
	   }
	 
	 @RequestMapping("login.action")
	 public String login(Admin admin,HttpSession session,Model model) {
		 if (admin.getAdminPwd()==null) {
			model.addAttribute("error", "登录失败");
			model.addAttribute("admin", admin);
			return "login";
		 }
		 admin=adminService.login(admin);
		 if (admin==null) {
				model.addAttribute("error", "登录失败");
				model.addAttribute("admin", admin);
				return "login";
		 }
		 if(admin.getAdminState().equals("否")) {
			 model.addAttribute("error", "登录失败");
			model.addAttribute("admin", admin);
			return "login";
		 }
		 session.setAttribute("admin", admin);  
		 model.addAttribute("loginadmin", admin);
		 return "index";
	 }
	 
	 @RequestMapping("modify.action")
		public  String modify(Model model,String adminPwd,HttpSession session) {
			Admin admin=(Admin) session.getAttribute("admin");
			if(adminPwd.equals(admin.getAdminPwd())){
				model.addAttribute(admin);
				return "info/info_modify";
			}else {
				model.addAttribute("info", "密码错误");
				return "info/info_main";
			}
	 }
	 @RequestMapping("ud.action")
	    public String ud(Model model,Admin admin) {
	    	boolean result=adminService.update(admin);
	        if(result) {
	            model.addAttribute("info", "修改成功");
	        }else {
	        	 model.addAttribute("info", "修改失败");
			}
	        return "info/info_main";
	    }
	 
	 @RequestMapping("logout.action")
	    public String out(HttpSession session) {
		 	session.invalidate();
	        return "redirect:/view/login.jsp";
	    }

}
