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
import com.guigu.system.po.TargetVO;
import com.guigu.system.target.service.TargetLevelService;
import com.guigu.system.target.service.TargetService;

@Controller
@RequestMapping("/target/")
public class TargetController {
	@Resource(name = "targetServiceImpl")
	private TargetService targetService;

	@RequestMapping("list.action")
	public String list(Model model,Target target) {
		List<Target> list = targetService.findList(target);
		model.addAttribute("list", list);
		return "target/target/target_list";
	}
	
	
	@RequestMapping("add.action")
	public String addTemplate(Model model, @Validated Target target, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("target", target);
			return "target/target/target_add";
		}
		boolean result = targetService.save(target);
		if (result) {
			model.addAttribute("info", "��ӳɹ�");
		} else {
			model.addAttribute("info", "���ʧ��");
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
			model.addAttribute("info", "�޸ĳɹ�");
		} else {
			model.addAttribute("info", "�޸�ʧ��");
		}
		return this.list(model,null);
	}

	@RequestMapping("delete.action")
	public String delete(Integer targetId, Model model) {
		boolean result = targetService.delete(targetId);

		if (result) {
			model.addAttribute("info", "ɾ���ɹ�");
		} else {
			model.addAttribute("info", "ɾ��ʧ��");
		}
		return this.list(model,null);
	}

}
