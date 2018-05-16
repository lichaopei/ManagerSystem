package com.guigu.system.attendance.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.attendance.service.AttendanceService;
import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.po.Admin;
import com.guigu.system.po.AttendanceRecordVO;
import com.guigu.system.po.Employees;
import com.guigu.system.po.EmployeesExample;
import com.guigu.system.po.EmployeesExample.Criteria;
import com.guigu.system.po.EmployeesVO;
import com.guigu.system.po.ModelList;
import com.guigu.system.po.mapper.EmployeesMapper;
import com.guigu.system.system.service.PopedomVOService;

@Controller
@RequestMapping("/attendance/attendance/")
public class AttendanceRecordController {
	@Resource(name="attendanceServiceImpl")
	private AttendanceService attendanceService;
	@Resource(name="employeeVOServiceImpl")
	private EmployeeVOService eService; 
	@Resource(name="popedomVOServiceImpl")
	private PopedomVOService popedomVOService;
	@Resource(name="employeesMapper")
	private EmployeesMapper employeesMapper;
	
	
	@RequestMapping("list.action")
	public String list(AttendanceRecordVO attendanceRecordVO,Model model,HttpSession session) {
		if(attendanceRecordVO==null) {
			attendanceRecordVO=new AttendanceRecordVO();
		}
		List<AttendanceRecordVO> list=new ArrayList<>();
		Admin admin =(Admin) session.getAttribute("admin");
		if("否".equals(admin.getAdminRight())) {
			attendanceRecordVO.setAdminId(admin.getAdminId());
			list=attendanceService.findList(attendanceRecordVO);
			
		}else {
			list=attendanceService.findList(attendanceRecordVO);
		}
		model.addAttribute("list", list);
		return "attendance/attendance/attendance_list";
	}
	@RequestMapping("beforeAdd.action")
	public String beforeAdd(Model model,HttpSession session) {
		List<EmployeesVO> temps = null;
		Admin admin=(Admin) session.getAttribute("admin");
		if("否".equals(admin.getAdminRight())) {
			List<Integer> integers=popedomVOService.findDept(admin);
			for (Integer integer : integers) {
				EmployeesVO employeeVO=new EmployeesVO();
				employeeVO.setDepartment(integer);
				temps=eService.findEmployees(employeeVO);
			}
		}else {
			temps=eService.findEmployees(null);
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
		return this.list(null, model,session);
	}
	
	@RequestMapping("load.action")
	public String load(Model model,int attendanceId) {
		AttendanceRecordVO attendanceRecordVO=attendanceService.findOne(attendanceId);
		model.addAttribute("temp", attendanceRecordVO);
		return "attendance/attendance/attendance_update";
	}
	@RequestMapping("update.action")
	public String update(Model model,AttendanceRecordVO attendanceRecordVO, HttpSession session) {
		boolean result=attendanceService.update(attendanceRecordVO);
        if(result) {
            model.addAttribute("info", "修改成功");
        }else {
            model.addAttribute("info", "修改失败");
        }
        return this.list(null, model,session);
	}
	@RequestMapping("total.action")
	public String total(Model model,AttendanceRecordVO attendanceRecordVO) {
			EmployeesExample example=new EmployeesExample();
			Criteria criteria=example.createCriteria();
			criteria.andEmployeeNameEqualTo(attendanceRecordVO.getEmployeeName());
			List<Employees> list=employeesMapper.selectByExample(example);
			if(list.isEmpty()) {
				model.addAttribute("info", "该员工不存在！");
				return "attendance/attendance/attendance_total";
			}
		
			String date=attendanceRecordVO.getAttendanceDate();
			attendanceRecordVO.setAttendanceType(1);
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setCq(attendanceService.totalAll(attendanceRecordVO));
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setAttendanceType(2);
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setGx(attendanceService.totalAll(attendanceRecordVO));
			attendanceRecordVO.setAttendanceType(3);
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setCd(attendanceService.totalAll(attendanceRecordVO));
			attendanceRecordVO.setAttendanceType(4);
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setKg(attendanceService.totalAll(attendanceRecordVO));
			attendanceRecordVO.setAttendanceType(5);
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setQj(attendanceService.totalAll(attendanceRecordVO));
			attendanceRecordVO.setAttendanceType(6);
			attendanceRecordVO.setAttendanceDate(date+"%");
			attendanceRecordVO.setBt(attendanceService.totalAll(attendanceRecordVO));
			attendanceRecordVO.setAttendanceDate(date);
		model.addAttribute("list", attendanceRecordVO);
		return "attendance/attendance/attendance_total";
	}
}