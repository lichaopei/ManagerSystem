package com.guigu.system.attendance.service.impl;

import java.util.List;
import java.util.function.Predicate;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.attendance.service.DepartmentRuleVOService;
import com.guigu.system.po.AttendanceRule;
import com.guigu.system.po.Department;
import com.guigu.system.po.DepartmentExample;
import com.guigu.system.po.DepartmentExample.Criteria;
import com.guigu.system.po.DepartmentRuleVO;
import com.guigu.system.po.mapper.AttendanceRuleMapper;
import com.guigu.system.po.mapper.DepartmentMapper;
import com.guigu.system.po.mapper.DepartmentRuleVOMapper;
@Service("departmentRuleVOServiceImpl")
public class DepartmentRuleVOServiceImpl implements DepartmentRuleVOService {
	@Resource(name="departmentRuleVOMapper")
	private DepartmentRuleVOMapper departmentRuleVOMapper;
	@Resource(name="attendanceRuleMapper")
	private AttendanceRuleMapper attendanceRuleMapper;

	@Override
	public List<DepartmentRuleVO> findList(DepartmentRuleVO departmentRuleVO) {
		if(departmentRuleVO!=null && departmentRuleVO.getDepartmentName()!=null) {
			departmentRuleVO.setDepartmentName("%"+departmentRuleVO.getDepartmentName()+"%");
			return departmentRuleVOMapper.findList(departmentRuleVO);
		}
		else
			return departmentRuleVOMapper.findList(null);
	}
	@Override
	public boolean save(DepartmentRuleVO departmentRuleVO) {
		try {
			int i = departmentRuleVOMapper.save(departmentRuleVO);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

	}

		return false;
	}

	@Override
	public boolean update(AttendanceRule attendanceRule) {
		try {
			int i = attendanceRuleMapper.updateByPrimaryKey(attendanceRule);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean delete(Integer ruleId) {
		int i = attendanceRuleMapper.deleteByPrimaryKey(ruleId);
		if (i > 0) {
			return true;
		}
		return false;
	}

	@Override
	public DepartmentRuleVO findOne(Integer ruleId) {
		return departmentRuleVOMapper.findOne(ruleId);
	}


}
