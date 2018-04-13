package com.guigu.system.target.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.po.TargetLevel;
import com.guigu.system.po.mapper.TargetLevelMapper;
import com.guigu.system.target.service.TargetLevelService;
@Service("targetLevelServiceImpl")
public class TargetLevelServiceImpl implements TargetLevelService{
	@Resource(name="targetLevelMapper")
	private TargetLevelMapper targetLevelMapper;

	@Override
	public List<TargetLevel> findList(TargetLevel targetLevel) {
		return targetLevelMapper.selectByExample(null);
	}
	@Override
	public boolean save(TargetLevel targetLevel) {
		int i=targetLevelMapper.insert(targetLevel);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int levelId) {
		int i=targetLevelMapper.deleteByPrimaryKey(levelId);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(TargetLevel targetLevel) {
		int i=targetLevelMapper.updateByPrimaryKey(targetLevel);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public TargetLevel findOne(int levelId) {
		return targetLevelMapper.selectByPrimaryKey(levelId);
	}

}
