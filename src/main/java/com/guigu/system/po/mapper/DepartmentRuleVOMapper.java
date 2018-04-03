package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.DepartmentRuleVO;

public interface DepartmentRuleVOMapper {
	
	public List<DepartmentRuleVO> findList(DepartmentRuleVO departmentRuleVO);
	
	public int save(DepartmentRuleVO departmentRuleVO);
	
	public DepartmentRuleVO findOne(int ruleId);

}
