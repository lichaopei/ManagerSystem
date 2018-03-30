package com.guigu.system.attendance.controller;

import java.util.List;

import javax.annotation.Resource;

import org.aspectj.weaver.ast.And;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.attendance.service.AttendanceService;
import com.guigu.system.po.AttendanceRecordVO;

@Controller
@RequestMapping("/attendance/attendance/")
public class AttendanceRecordController {
	@Resource(name="attendanceServiceImpl")
	private AttendanceService attendanceService;
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

}
