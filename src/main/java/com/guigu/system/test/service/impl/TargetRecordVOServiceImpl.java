package com.guigu.system.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.po.TargetRecord;
import com.guigu.system.po.TargetRecordVO;
import com.guigu.system.po.mapper.TargetRecordMapper;
import com.guigu.system.po.mapper.TargetRecordVOMapper;
import com.guigu.system.test.service.TargetRecordVOService;
@Service("targetRecordVOServiceImpl")
public class TargetRecordVOServiceImpl implements TargetRecordVOService {
	@Resource(name="targetRecordVOMapper")
	private TargetRecordVOMapper targetRecordVOMapper;
	@Resource(name="targetRecordMapper")
	private TargetRecordMapper targetRecordMapper;
	
	@Override
	public List<TargetRecordVO> findList(Integer parentId) {
		return targetRecordVOMapper.findList(parentId);
	}

	@Override
	public boolean save(TargetRecord targetRecord) {
		int i=targetRecordMapper.insert(targetRecord);
		if(i>0) {
			return true;
		}
			return false;
	}

	@Override
	public boolean update(TargetRecord targetRecord) {
		
		int i=targetRecordMapper.updateByPrimaryKey(targetRecord);
		if(i>0) {
			return true;
		}
			return false;
	}

	@Override
	public boolean delete(int targetId) {
		int i=targetRecordMapper.deleteByPrimaryKey(targetId);
		if(i>0) {
			return true;
		}
			return false;
	}

	@Override
	public TargetRecordVO findOnet(int targetId) {
		return targetRecordVOMapper.findOne(targetId);
	}
	
	@Override
	public List<TargetRecordVO> find(String  parentName) {
		return targetRecordVOMapper.find(parentName);
	}


}
