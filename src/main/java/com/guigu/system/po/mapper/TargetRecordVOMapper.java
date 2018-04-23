package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.TargetRecordVO;

public interface TargetRecordVOMapper {
	
	public List<TargetRecordVO> findList(int parentId);
	
	public TargetRecordVO findOne(int targetId);
	

}
