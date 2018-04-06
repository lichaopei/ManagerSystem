package com.guigu.system.system.service;

import java.util.List;

import com.guigu.system.po.Admin;
import com.guigu.system.po.PopedomVO;
public interface PopedomVOService {
	public List<PopedomVO> findList(PopedomVO popedomVO);
	
	public PopedomVO findOne(Integer popedomId);
	
	public boolean save(PopedomVO popedomVO);
	
	public boolean update(PopedomVO popedomVO);
	
	public boolean delete(Integer popedomId);
	
	public List<Integer> findDept(Admin admin);

}
