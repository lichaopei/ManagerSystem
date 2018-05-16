package com.guigu.system.target.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.po.Target;
import com.guigu.system.po.TargetLevel;
import com.guigu.system.po.mapper.TargetRecordVOMapper;
import com.guigu.system.target.service.TargetLevelService;
import com.guigu.system.target.service.TargetService;

@Controller
@RequestMapping("/target/")
public class TargetController {
	@Resource(name = "targetServiceImpl")
	private TargetService targetService;

	@Resource(name="targetRecordVOMapper")
	private TargetRecordVOMapper targetRecordVOMapper;
	
	@RequestMapping("list.action")
	public String list(Model model,Target target) {
		List<Target> list = targetService.findList(target);
		model.addAttribute("list", list);
		return "target/target/target_list";
	}
	
	
	@RequestMapping("add.action")
	public String addTemplate(Model model,Target target) {
		boolean result = targetService.save(target);
		if (result) {
			model.addAttribute("info", "添加成功");
		} else {
			model.addAttribute("info", "添加失败");
		}
		return this.list(model,null);

	}

	@RequestMapping("load.action")
	public String load(Integer targetId, Model model) {
		Target target = targetService.findOne(targetId);
		model.addAttribute("target", target);
		return "target/target/target_update";
	}

	@RequestMapping("update.action")
	public String update(Model model, @Validated Target target, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("target", target);
			return "target/target/target_add";
		}
		boolean result = targetService.update(target);
		if (result) {
			model.addAttribute("info", "修改成功");
		} else {
			model.addAttribute("info", "修改失败");
		}
		return this.list(model,null);
	}

	@RequestMapping("delete.action")
	public String delete(Integer targetId, Model model) {
		
		 int i=targetRecordVOMapper.findCount(targetId);
		 if (i>0) {
        	 model.addAttribute("info", "该指标被引用，不能删除！");
        	 return this.list( model,null);
		}
		 targetService.delete(targetId);
			model.addAttribute("info", "删除成功");
		
		return this.list(model,null);
	}

}
