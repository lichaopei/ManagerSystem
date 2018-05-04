package com.guigu.system.test.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.guigu.system.po.EmpTest;
import com.guigu.system.po.EmpTestVO;
import com.guigu.system.po.mapper.EmpTestMapper;
import com.guigu.system.po.mapper.EmpTestVOMapper;
import com.guigu.system.test.service.EmpTestVOService;

@Service("empTestVOServiceImpl")
public class EmpTestVOServiceImpl implements EmpTestVOService{
	
	@Resource(name="empTestVOMapper")
	private EmpTestVOMapper empTestVOMapper;
	
	@Resource(name="empTestMapper")
	private EmpTestMapper empTestMapper;

	@Override
	public List<EmpTestVO> findList(EmpTestVO empTestVO) {
			if(empTestVO!=null && empTestVO.getEmployeeName()!=null ) {
				empTestVO.setEmployeeName("%"+empTestVO.getEmployeeName()+"%");
			}
			return empTestVOMapper.findList(empTestVO);
			
	}

	@Override
	public EmpTestVO findOne(int testId) {
		return null;
	}

	@Override
	public boolean delete(int testId) {
		int result=empTestMapper.deleteByPrimaryKey(testId);
		if(result>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean save(EmpTestVO empTestVO) {
		EmpTest empTest=empTestVO;
		int i=empTestMapper.insert(empTest);
		if(i>0) {
			return true;
		}
		return false;
	}
}
