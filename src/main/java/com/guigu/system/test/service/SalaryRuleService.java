package com.guigu.system.test.service;

import java.util.List;

import com.guigu.system.po.SalaryRuleVO;

public interface SalaryRuleService {
	
	List<SalaryRuleVO> findList(SalaryRuleVO salaryRuleVO);
	
	SalaryRuleVO findOne(SalaryRuleVO salaryRuleVO);
	
	boolean delete(Integer salaryId);
	
	boolean  save(SalaryRuleVO salaryRuleVO);
	
	boolean update(SalaryRuleVO salaryRuleVO);
	

}
