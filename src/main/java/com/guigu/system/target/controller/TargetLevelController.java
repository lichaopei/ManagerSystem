package com.guigu.system.target.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.po.Department;
import com.guigu.system.po.TargetLevel;
import com.guigu.system.target.service.TargetLevelService;

@Controller
@RequestMapping("/targetlevel/")
public class TargetLevelController {
	@Resource(name="targetLevelServiceImpl")
	private TargetLevelService targetLevelService;
	@RequestMapping("list.action")
	public String list(Model model) {
		List<TargetLevel> list=targetLevelService.findList(null);
		model.addAttribute("list", list);
		return "target/targetlevel/level_list";
	}
	
	@RequestMapping("add.action")
    public String addTemplate(Model model,@Validated TargetLevel targetLevel,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("targetLevel", targetLevel);
			return "target/targetlevel/level_add";
		}
		boolean result= targetLevelService.save(targetLevel);
       if(result) {
           model.addAttribute("info","添加成功");
       }else {
           model.addAttribute("info","添加失败");
       }
       return this.list( model);
       
    }
	@RequestMapping("load.action")
    public String load(Integer levelId,Model model) {
    	TargetLevel targetLevel=targetLevelService.findOne(levelId);
        model.addAttribute("targetLevel", targetLevel);
        return "target/targetlevel/level_update";
    }
	@RequestMapping("update.action")
    public String update(Model model,@Validated TargetLevel targetLevel,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("targetLevel", targetLevel);
			return "target/targetlevel/level_add";
		}
    	boolean result=targetLevelService.update(targetLevel);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(model);
    }
	 @RequestMapping("delete.action")
	    public String delete(Integer levelId,Model model) {
	        boolean result =targetLevelService.delete(levelId);
	        
	        if(result) {
	            model.addAttribute("info", "删除成功");
	        }else {
	            model.addAttribute("info", "删除失败");
	        }
	        return this.list( model);
	    }
	
}
