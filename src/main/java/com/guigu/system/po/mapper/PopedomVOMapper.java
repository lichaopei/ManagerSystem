package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.PopedomVO;

public interface PopedomVOMapper {
		
	public List<PopedomVO> findList(PopedomVO popedomVO);
	
	public int save(PopedomVO popedomVO);
	
	public int findCount(int adminId);
}
