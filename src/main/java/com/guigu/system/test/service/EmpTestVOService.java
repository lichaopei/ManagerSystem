package com.guigu.system.test.service;

import java.util.List;


import com.guigu.system.po.EmpTestVO;

public interface EmpTestVOService {
	
	public List<EmpTestVO> findList(EmpTestVO empTestVO);
	
	public EmpTestVO findOne(int testId);
	
	public boolean delete(int testId);
	
	public boolean save(EmpTestVO empTestVO);

}
