package com.guigu.system.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.po.EmpTestVO;
import com.guigu.system.test.service.EmpTestVOService;
import com.guigu.system.test.service.TargetRecordVOService;

@RequestMapping("/empTest/")
@Controller
public class EmpTestController {

	@Resource(name="empTestVOServiceImpl")
	private EmpTestVOService empTestVOService;
	
	@Resource(name="targetRecordVOServiceImpl")
	private TargetRecordVOService targetRecordVOService;
	
	@RequestMapping("list.action")
	public String list(Model model,EmpTestVO empTestVO) {
		List<EmpTestVO> list=empTestVOService.findList(empTestVO);
		model.addAttribute("list", list);
		return "test/empTest_list";
	}
	
	
	
}
