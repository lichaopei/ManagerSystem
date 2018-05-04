package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.SalaryRuleVO;

public interface SalaryRuleVOMapper {
	
	List<SalaryRuleVO> findList(SalaryRuleVO salaryRuleVO);
	
	SalaryRuleVO findOne(SalaryRuleVO salaryRuleVO);

}
