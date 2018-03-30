package com.guigu.system.construct.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.construct.service.DepartmentService;
import com.guigu.system.po.Department;
import com.guigu.system.po.DepartmentExample;
import com.guigu.system.po.DepartmentExample.Criteria;
import com.guigu.system.po.mapper.DepartmentMapper;

@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {
	@Resource(name="departmentMapper")
	private DepartmentMapper departmentMapper;

	@Override
	public List<Department> findList(Department department) {
		DepartmentExample departmentExample=new DepartmentExample();
		Criteria criteria=departmentExample.createCriteria();
		if(department!=null) {
			if(department.getDepartmentName()!=null) {
				department.setDepartmentName("%"+department.getDepartmentName()+"%");
				criteria.andDepartmentNameLike(department.getDepartmentName());
			}
		}
		return departmentMapper.selectByExample(departmentExample);
	}

	@Override
	public Department findOne(Integer departmentId) {
		return departmentMapper.selectByPrimaryKey(departmentId);
	}

	@Override
	public boolean save(Department department) {
		try {
			int i =departmentMapper.insert(department);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean update(Department department) {
		try {
			int i = departmentMapper.updateByPrimaryKey(department);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean delete(Integer departmentId) {
		try {
			int i = departmentMapper.deleteByPrimaryKey(departmentId);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}
		return false;
	}

}
