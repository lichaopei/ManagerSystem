package com.guigu.system.construct.service;

import java.util.List;

import com.guigu.system.po.Employees;
import com.guigu.system.po.EmployeesVO;
public interface EmployeeVOService {
	
	public List<EmployeesVO> findEmployees(EmployeesVO employeeVO);
	
	public EmployeesVO findOne(Integer emloyeesid);
	
	public boolean save(EmployeesVO employeesVO);
	
	public boolean update(EmployeesVO employeesVO);
	
	public boolean delete(Integer emloyeesid);
	
	public int findCount(Integer departmentId);

}
