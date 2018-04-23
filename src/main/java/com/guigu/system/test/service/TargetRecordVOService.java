package com.guigu.system.test.service;

import java.util.List;
import com.guigu.system.po.TargetRecord;
import com.guigu.system.po.TargetRecordVO;

public interface TargetRecordVOService {
	
	public  List<TargetRecordVO> findList(Integer parentId);
	
	public  boolean save(TargetRecord targetRecord);
	
	public  boolean update(TargetRecord targetRecord);
	
	public  boolean delete(int targetId);
	
	public  TargetRecordVO findOnet(int targetId);

}
