package com.guigu.system.construct.service;

import java.util.List;

import com.guigu.system.po.Department;
import com.guigu.system.po.Position;

public interface DepartmentService {
	
public List<Department> findList(Department department);
	
	public Department findOne(Integer departmentId);
	
	public boolean save(Department department);
	
	public boolean update(Department department);
	
	public boolean delete(Integer departmentId);
	
	public List<Department> findOther();

}
