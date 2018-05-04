package com.guigu.system.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.guigu.system.po.SalaryRule;
import com.guigu.system.po.SalaryRuleVO;
import com.guigu.system.po.mapper.SalaryRuleMapper;
import com.guigu.system.po.mapper.SalaryRuleVOMapper;
import com.guigu.system.test.service.SalaryRuleService;
@Service("salaryRuleServiceImpl")
public class SalaryRuleServiceImpl implements SalaryRuleService{
	
	@Resource(name="salaryRuleVOMapper")
	private SalaryRuleVOMapper salaryRuleVOMapper;
	
	@Resource(name="salaryRuleMapper")
	private SalaryRuleMapper salaryRuleMapper;
	
	SalaryRule salaryRule=new SalaryRule();

	@Override
	public List<SalaryRuleVO> findList(SalaryRuleVO salaryRuleVO) {
		if( salaryRuleVO!=null && salaryRuleVO.getPosition()!=null ) {
			salaryRuleVO.setPosition("%"+salaryRuleVO.getPosition()+"%");
		}
		return salaryRuleVOMapper.findList(salaryRuleVO);
	}

	@Override
	public SalaryRuleVO findOne(SalaryRuleVO salaryRuleVO) {
		return salaryRuleVOMapper.findOne(salaryRuleVO);
	}

	@Override
	public boolean delete(Integer salaryId) {
		int i=salaryRuleMapper.deleteByPrimaryKey(salaryId);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean save(SalaryRuleVO salaryRuleVO) {
		salaryRule=salaryRuleVO;
		int i=salaryRuleMapper.insert(salaryRule);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(SalaryRuleVO salaryRuleVO) {
		salaryRule=salaryRuleVO;
		int i=salaryRuleMapper.updateByPrimaryKey(salaryRule);
		if(i>0) {
			return true;
		}
		return false;
	}

}
