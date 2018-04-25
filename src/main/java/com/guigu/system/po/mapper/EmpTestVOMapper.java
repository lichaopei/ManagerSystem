package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.EmpTestVO;

public interface EmpTestVOMapper {
	
	public List< EmpTestVO> findList(EmpTestVO empTestVO);
	
	public int save(EmpTestVO  empTestVO);
	
	public int findOne(Integer  testId);

}
