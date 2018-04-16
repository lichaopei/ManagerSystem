package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.TargetVO;

public interface TargetVOMapper {
	public List<TargetVO> findList(TargetVO targetVO);
	
	public TargetVO findOne(int targetId);

}
