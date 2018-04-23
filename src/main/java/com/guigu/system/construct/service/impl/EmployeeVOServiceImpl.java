package com.guigu.system.construct.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.guigu.system.construct.service.EmployeeVOService;
import com.guigu.system.po.AttendanceRecord;
import com.guigu.system.po.AttendanceRecordExample;
import com.guigu.system.po.Department;
import com.guigu.system.po.Employees;
import com.guigu.system.po.EmployeesVO;
import com.guigu.system.po.mapper.AttendanceRecordMapper;
import com.guigu.system.po.mapper.DepartmentMapper;
import com.guigu.system.po.mapper.EmployeesMapper;
import com.guigu.system.po.mapper.EmployeesVOMapper;
import com.guigu.system.po.mapper.PositionMapper;
@Service("employeeVOServiceImpl")
public class EmployeeVOServiceImpl implements EmployeeVOService {
	@Resource(name="employeesMapper")
	private EmployeesMapper employeesMapper;
	@Resource(name="employeesVOMapper")
	private EmployeesVOMapper employeesVOMapper;
	@Resource(name="departmentMapper")
	private DepartmentMapper departmentMapper;
	@Resource(name="positionMapper")
	private PositionMapper positionMapper;
	private Employees employees=new Employees();
	private Department dept=new Department();
	@Override
	public boolean save(EmployeesVO employeesVO) {
		int i=employeesVOMapper.save(employeesVO);
		EmployeesVO VO=(EmployeesVO) employeesVOMapper.findList(employeesVO).get(0);
		//设置部门员工数+1
		dept.setDepartmentId(employeesVO.getDepartment());
		dept=departmentMapper.selectByPrimaryKey(dept.getDepartmentId());
		dept.setEmpNumber(dept.getEmpNumber()+1);
		departmentMapper.updateByPrimaryKey(dept);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(EmployeesVO employeesVO) {
		try {
			BeanUtils.copyProperties(employees, employeesVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int i=employeesMapper.updateByPrimaryKey(employees);
		if (i>0) {
			return true;
		}
		return false;
	}

	@Override
	public EmployeesVO findOne(Integer emloyeesId) {
		EmployeesVO employeesVO=new EmployeesVO();
		employees=employeesMapper.selectByPrimaryKey(emloyeesId);
		try {
			BeanUtils.copyProperties(employeesVO, employees);
		} catch (Exception e) {
			e.printStackTrace();
		}
		employeesVO.setDepartmentName(departmentMapper.selectByPrimaryKey(employees.getDepartment()).getDepartmentName());
		employeesVO.setPositionName(positionMapper.selectByPrimaryKey(employees.getPosition()).getPositionMemo());
		return employeesVO;
	}

	@Override
	public boolean delete(Integer emloyeesId) {
	    
	    employees=employeesMapper.selectByPrimaryKey(emloyeesId);
	    dept.setDepartmentId(employees.getDepartment());
		dept=departmentMapper.selectByPrimaryKey(dept.getDepartmentId());
		dept.setEmpNumber(dept.getEmpNumber()-1);
		int j=departmentMapper.updateByPrimaryKey(dept);
		employees.setEmployeeState("0");
		int i=employeesMapper.updateByPrimaryKey(employees);
		if(i>0 && j>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<EmployeesVO> findEmployees(EmployeesVO employeesVO) {
		List<EmployeesVO> list=new ArrayList<>();
		if(employeesVO!=null) {
			if(employeesVO.getDepartmentName()!=null) {
				employeesVO.setDepartmentName("%"+employeesVO.getDepartmentName()+"%");
			}
			if(employeesVO.getPositionName()!=null) {
				employeesVO.setPositionName("%"+employeesVO.getPositionName()+"%");
			}
			if (employeesVO.getEmployeeName()!=null) {
				employeesVO.setEmployeeName("%"+employeesVO.getEmployeeName()+"%");
			}
		 list=employeesVOMapper.findList(employeesVO);
		}else { 
			list=employeesVOMapper.findList(null);
		}
		return list;
	}

	@Override
	public int findCount(Integer departmentId) {
		return employeesVOMapper.findCount(departmentId);
	}

}
