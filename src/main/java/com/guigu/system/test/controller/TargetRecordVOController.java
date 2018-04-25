package com.guigu.system.test.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.po.ModelList;
import com.guigu.system.po.Target;
import com.guigu.system.po.TargetRecordExample.Criteria;
import com.guigu.system.po.TargetList;
import com.guigu.system.po.TargetRecord;
import com.guigu.system.po.TargetRecordExample;
import com.guigu.system.po.TargetRecordVO;
import com.guigu.system.po.mapper.TargetRecordMapper;
import com.guigu.system.target.service.TargetLevelService;
import com.guigu.system.target.service.TargetService;
import com.guigu.system.test.service.TargetRecordVOService;

@Controller
@RequestMapping("/test/")
public class TargetRecordVOController {
	@Resource(name="targetLevelServiceImpl")
	private TargetLevelService targetLevelService;
	@Resource(name="targetRecordVOServiceImpl")
	private TargetRecordVOService targetRecordVOService;
	@Resource(name="targetServiceImpl")
	private TargetService targetService;
	@Resource(name="targetRecordMapper")
	private TargetRecordMapper targetRecordMapper;
	private TargetRecord targetRecord=new TargetRecord();
	
	@RequestMapping("create.action")
	public String findTable(Model model) {
		Target target=new Target();
		target.setTargetLevel(2);
		List<Target> targetList=targetService.findList(target);
		model.addAttribute("target", targetList);
		target.setTargetLevel(1);
		List<Target> list=targetService.findList(target);
		model.addAttribute("list", list);
		return "test/test_create";
	}
	
	
	@RequestMapping("add.action")
	public String add(ModelList list,HttpServletRequest request,Model model) {
		String[] parentTargetId=request.getParameterValues("parentTarget");
		String[] targetId=request.getParameterValues("targetId");
		if (parentTargetId==null|| targetId==null) {
			model.addAttribute("error", "设置不能为空!");
			return this.findTable(model);
		}
		for (int i = 0; i < targetId.length; i++) {
			Target target=targetService.findOne(Integer.parseInt(targetId[i]));
			targetRecord.setTargetId(target.getTargetId());
			targetRecord.setParentTarget(Integer.parseInt(parentTargetId[i]));
			targetRecord.setRemarks(target.getRemarks());
			targetRecordVOService.save(targetRecord);
		}
		int parentTarget=Integer.parseInt(parentTargetId[0]);
		model.addAttribute("info", "添加成功");
		return this.load(model,parentTarget);
	}
	@RequestMapping("load.action")
	private String load(Model model, Integer parentTarget) {
		if(parentTarget!=0) {
			List<TargetRecordVO> list=targetRecordVOService.findList(parentTarget);
			model.addAttribute("list", list);
			return "test/test_update";
		}
		return this.first(model); 
	}
	@RequestMapping("update.action")
	private String update(Model model,TargetList list,BindingResult bindingResult) {
		List<TargetRecordVO> vos=list.getList();
		double sum=0;
		for (TargetRecordVO targetRecordVO : vos) {
			sum+=targetRecordVO.getScore();
			if(targetRecordVO.getWeight()!=targetRecordVO.getScore()) {
				model.addAttribute("errors","设置出错！");
			}
		}
		if(sum!=100) {
			model.addAttribute("errors","设置出错！");
		}
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors = bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			return "test/test_add";
		}
		for (TargetRecordVO targetRecordVO : vos) {
			targetRecord=targetRecordVO;
			targetRecordVOService.update(targetRecord);
		}
		model.addAttribute("info", "更新成功");
		return this.first(model);
	}
	@RequestMapping("main.action")
	public String main(TargetRecordVO targetRecordVO,Model model) {
		int parentId=targetRecordVO.getParentTarget();
		List<TargetRecordVO>list= targetRecordVOService.findList(parentId);
		Target target=new Target();
		target.setTargetLevel(1);
		List<Target> t=targetService.findList(target);
		model.addAttribute("target", t);
		model.addAttribute("list", list);
		return "test/test_main";
	}
	@RequestMapping("first.action")
	public String first(Model model) {
		Target target=new Target();
		target.setTargetLevel(1);
		List<Target> list=targetService.findList(target);
		model.addAttribute("target", list);
		return "test/test_main";
	} 
	@RequestMapping("delete.action")
	public String delete(Model model,TargetRecord targetRecord) {
		if(targetRecord.getParentTarget()!=null) {
			TargetRecordExample example=new TargetRecordExample();
			Criteria criteria=example.createCriteria();
			criteria.andParentTargetEqualTo(targetRecord.getParentTarget());
			int result=targetRecordMapper.deleteByExample(example);
			if(result>0) {
				model.addAttribute("info", "删除成功");
			}else {
				model.addAttribute("info", "删除失败");
			}
		    return this.first(model);
		}
		if(targetRecord.getRecordId()!=null) {
			targetRecord=targetRecordMapper.selectByPrimaryKey(targetRecord.getRecordId());
			int parentTarget=targetRecord.getParentTarget();
			boolean result =targetRecordVOService.delete(targetRecord.getRecordId());
			if(result){
				model.addAttribute("info", "删除成功");
			}else {
				model.addAttribute("info", "删除失败");
			}
			return this.load(model, parentTarget);
		}
		return null;
	}
	
}
