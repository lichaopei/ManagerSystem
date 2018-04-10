package com.guigu.system.order.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.order.service.PhotoTypeService;
import com.guigu.system.po.PhotoType;

@Controller
@RequestMapping("/order/type/")
public class PhotoTypeController {
	@Resource(name="photoTypeServiceImpl")
	private PhotoTypeService photoTypeService;
	
	@RequestMapping("list.action")
	public String list(PhotoType photoType,Model model) {
		List<PhotoType> list=photoTypeService.findList(photoType);
		model.addAttribute("list", list);
		return "/order/type/type_list";
	}
	
	@RequestMapping("add.action")
    public String addTemplate(Model model,@Validated PhotoType photoType,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("photoType", photoType);
			return "/order/type/type_add";
		}
		boolean result= photoTypeService.save(photoType);
       if(result) {
           model.addAttribute("info","��ӳɹ�");
       }else {
           model.addAttribute("info","���ʧ��");
       }
       return this.list(null,model);
       
    }
	@RequestMapping("load.action")
    public String load(Integer typeId,Model model) {
		PhotoType photoType=photoTypeService.findOne(typeId);
        model.addAttribute("photoType", photoType);
        return "/order/type/type_update";
    }
	@RequestMapping("update.action")
    public String update(Model model,@Validated PhotoType photoType,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("photoType", photoType);
			return "/order/type/type_update";
		}
    	boolean result=photoTypeService.update(photoType);
        if(result) {
            model.addAttribute("info", "�޸ĳɹ�");
        }else {
            model.addAttribute("info", "�޸�ʧ��");
        }
        return this.list(null,model);
    }
	 @RequestMapping("delete.action")
	    public String delete(Integer typeId,Model model) {
	        boolean result =photoTypeService.delete(typeId);
	        
	        if(result) {
	            model.addAttribute("info", "ɾ���ɹ�");
	        }else {
	            model.addAttribute("info", "ɾ��ʧ��");
	        }
	        return this.list(null,model);
	    }
	
	
}
