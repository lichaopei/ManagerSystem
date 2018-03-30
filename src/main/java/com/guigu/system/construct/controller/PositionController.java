package com.guigu.system.construct.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.construct.service.PositionService;
import com.guigu.system.po.Position;

@Controller
@RequestMapping("/construct/position/")
public class PositionController {
	
		@Resource(name="positionServiceImpl")
		private PositionService positionService;
		
		@RequestMapping("list.action")
		public String list(Position position,Model model) {
			List<Position> list=positionService.findList(position);
			model.addAttribute("list", list);
			return "/construct/position/position_list";
		}
		
		@RequestMapping("add.action")
	    public String addTemplate(Model model,@Validated Position position,BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				List<ObjectError> allErrors=bindingResult.getAllErrors();
				model.addAttribute("allErrors", allErrors);
				model.addAttribute("position", position);
				return "/construct/position/position_add";
			}
			boolean result=positionService.save(position);
	       if(result) {
	           model.addAttribute("info","��ӳɹ�");
	       }else {
	           model.addAttribute("info","���ʧ��");
	       }
	       return this.list(null, model);
	       
	    }
		@RequestMapping("load.action")
	    public String load(Integer positionId,Model model) {
	    	Position position=positionService.findOne(positionId);
	        model.addAttribute("position", position);
	        return "construct/position/position_update";
	    }
		
		@RequestMapping("update.action")
	    public String update(Model model,@Validated Position position,BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				List<ObjectError> allErrors=bindingResult.getAllErrors();
				model.addAttribute("allErrors", allErrors);
				model.addAttribute("position", position);
				return "construct/position/position_update";
			}
	    	boolean result=positionService.update(position);
	        if(result) {
	            model.addAttribute("info", "�޸ĳɹ�");
	        }else {
	            model.addAttribute("info", "�޸�ʧ��");
	        }
	        return this.list(null, model);
	    }
		
		 @RequestMapping("delete.action")
		    public String delete(Integer positionId,Model model) {
		        boolean result =positionService.delete(positionId);
		        
		        if(result) {
		            model.addAttribute("info", "ɾ���ɹ�");
		        }else {
		            model.addAttribute("info", "ɾ��ʧ��");
		        }
		        return this.list(null, model);
		    }

}
