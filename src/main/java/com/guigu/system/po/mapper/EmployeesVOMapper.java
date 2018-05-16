package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.EmployeesVO;


public interface EmployeesVOMapper {
	
	public List<EmployeesVO> findList(EmployeesVO employeesVO);
	
	public int save(EmployeesVO employeesVO);
	
	public int findCount(Integer departmentId);
	
	public int findAll(Integer positionId);

}
