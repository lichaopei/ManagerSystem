package com.guigu.system.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.construct.service.PositionService;
import com.guigu.system.po.Department;
import com.guigu.system.po.Position;
import com.guigu.system.po.SalaryRuleVO;
import com.guigu.system.test.service.SalaryRuleService;

@Controller
@RequestMapping("/salaryrule/")
public class SalaryRuleController {

	@Resource(name="salaryRuleServiceImpl")
	private SalaryRuleService salaryRuleService;
	
	@Resource(name="positionServiceImpl")
	private PositionService positionService;
	
	private SalaryRuleVO sRuleVO=new SalaryRuleVO();
	
	@RequestMapping("list.action")
	public String list(Model model,SalaryRuleVO salaryRuleVO) {
		List<SalaryRuleVO> list=salaryRuleService.findList(salaryRuleVO);
		model.addAttribute("list", list);
		return "test/salaryrule_list";
	}
	
	
	@RequestMapping("search.action")
	public String search(Model model) {
		List<Position> list=positionService.findList(null);
		model.addAttribute("list", list);
		return "test/salaryrule_add";
	}
	
	@RequestMapping("add.action")
	public String add(Model model,SalaryRuleVO salaryRuleVO ) {
		boolean result=salaryRuleService.save(salaryRuleVO);
		if(result) {
			model.addAttribute("info", "添加成功");
		}else {
			model.addAttribute("info", "添加失败");
		}
		return this.list(model, null);
	}
	
	@RequestMapping("load.action")
	public String load(Model model,SalaryRuleVO salaryRuleVO) {
		sRuleVO = salaryRuleService.findOne(salaryRuleVO);
		model.addAttribute("rule",sRuleVO);
		return "test/salaryrule_update";
	}
	
	@RequestMapping("update.action")
	public String update(Model model,SalaryRuleVO salaryRuleVO) {
		boolean result = salaryRuleService.update(salaryRuleVO);
		if(result) {
			model.addAttribute("info", "更新成功");
		}else {
			model.addAttribute("info", "更新失败");
		}
		return this.list(model, null);
	}
	@RequestMapping("delete.action")
	public String delete(Model model,int salaryId) {
		
		boolean result=salaryRuleService.delete(salaryId);
		if(result) {
			model.addAttribute("info", "删除成功");
		}else {
			model.addAttribute("info", "删除失败");
		}
		return this.list(model, null);
		
	}
	
}
