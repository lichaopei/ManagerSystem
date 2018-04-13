package com.guigu.system.attendance.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpSession;

import org.apache.catalina.core.ApplicationContext;
import org.aspectj.weaver.ast.And;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guigu.system.attendance.service.AttendanceService;
import com.guigu.system.po.Admin;
import com.guigu.system.po.AdminPopedom;
import com.guigu.system.po.AttendanceRecordVO;
import com.guigu.system.po.ModelList;
import com.guigu.system.po.Temp;
import com.guigu.system.po.TempVO;
import com.guigu.system.po.mapper.AdminPopedomMapper;
import com.guigu.system.po.mapper.PopedomVOMapper;
import com.guigu.system.po.mapper.TempMapper;
import com.guigu.system.po.mapper.TempVOMapper;
import com.guigu.system.system.controller.AdminController;
import com.guigu.system.system.service.PopedomVOService;

@Controller
@RequestMapping("/attendance/attendance/")
public class AttendanceRecordController {
	@Resource(name="attendanceServiceImpl")
	private AttendanceService attendanceService;
	@Resource(name="tempVOMapper")
	private TempVOMapper tempVOMapper;
	@Resource(name="tempMapper")
	private TempMapper tempMapper;
	@Resource(name="popedomVOServiceImpl")
	private PopedomVOService popedomVOService;
	@RequestMapping("list.action")
	public String list(AttendanceRecordVO attendanceRecordVO,Model model) {
		if(attendanceRecordVO!=null) {
			if(attendanceRecordVO.getDepartmentName()!=null) {
				attendanceRecordVO.setDepartmentName("%"+attendanceRecordVO.getDepartmentName()+"%");
			}
			if (attendanceRecordVO.getEmployeeName()!=null) {
				attendanceRecordVO.setEmployeeName("%"+attendanceRecordVO.getEmployeeName()+"%");
			}
		}
		List<AttendanceRecordVO> list=attendanceService.findList(attendanceRecordVO);
		model.addAttribute("list", list);
		return "attendance/attendance/attendance_list";
	}
	
	
	@RequestMapping("beforeAdd.action")
	public String beforeAdd(Model model,HttpSession session) {
		Admin admin=(Admin) session.getAttribute("admin");
		List<Integer> integers=popedomVOService.findDept(admin);
		List<TempVO> temps=new ArrayList<>();
		for (Integer integer : integers) {
			temps=tempVOMapper.findList(integer);
		}
		model.addAttribute("tempVO", temps);
		return "attendance/attendance/attendance_add";
	}
	
	@RequestMapping("add.action")
	public String add(ModelList list,Model model,HttpSession session) {
		Admin admin=(Admin) session.getAttribute("admin");
		List<AttendanceRecordVO> recordVOs=list.getList();
		for (AttendanceRecordVO attendanceRecordVO : recordVOs) {
			attendanceRecordVO.setAdminId(admin.getAdminId());
			attendanceService.save(attendanceRecordVO);
		}
		return this.list(null, model);
	}
	
	@RequestMapping("load.action")
	public String load(Model model,int attendanceId) {
		AttendanceRecordVO attendanceRecordVO=attendanceService.findOne(attendanceId);
		model.addAttribute("temp", attendanceRecordVO);
		return "attendance/attendance/attendance_update";
	}
	@RequestMapping("update.action")
	public String update(Model model,@Validated AttendanceRecordVO attendanceRecordVO,BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			List<ObjectError> allErrors=bindingResult.getAllErrors();
			model.addAttribute("allErrors", allErrors);
			model.addAttribute("temp", attendanceRecordVO);
			return "attendance/attendance/attendance_update";
		}
		boolean result=attendanceService.update(attendanceRecordVO);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model);
	}
}