package com.guigu.system.attendance.service;

import java.util.List;

import com.guigu.system.po.AttendanceRule;
import com.guigu.system.po.DepartmentRuleVO;

public interface DepartmentRuleVOService {
	
	public List<DepartmentRuleVO> findList(DepartmentRuleVO departmentRuleVO);
	
	public DepartmentRuleVO findOne(Integer ruleId);
	
	public boolean save(DepartmentRuleVO departmentRuleVO);
	
	public boolean update(AttendanceRule attendanceRule);
	
	public boolean delete(Integer ruleId);

}
