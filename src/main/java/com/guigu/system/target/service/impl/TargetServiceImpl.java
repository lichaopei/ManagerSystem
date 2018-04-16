package com.guigu.system.target.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.po.Target;
import com.guigu.system.po.TargetExample;
import com.guigu.system.po.TargetExample.Criteria;
import com.guigu.system.po.TargetVO;
import com.guigu.system.po.mapper.TargetMapper;
import com.guigu.system.po.mapper.TargetVOMapper;
import com.guigu.system.target.service.TargetService;
@Service("targetServiceImpl")
public class TargetServiceImpl implements TargetService{
	@Resource(name="targetMapper")
	private TargetMapper targetMapper;
	@Resource(name="targetVOMapper")
	private TargetVOMapper targetVOMapper;

	@Override
	public List<Target> findList(Target  target) {
		TargetExample example=new TargetExample();
		Criteria criteria=example.createCriteria();
		if(target!=null) {
			if(target.getTargetLevel()!=null) {
			criteria.andTargetLevelEqualTo(target.getTargetLevel());
			}
		}
		return targetMapper.selectByExample(example);
	}

	@Override
	public boolean save(Target target) {
		int i=targetMapper.insert(target);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(int targetId) {
		int i=targetMapper.deleteByPrimaryKey(targetId);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Target target) {
		int i=targetMapper.updateByPrimaryKey(target);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public Target findOne(int targetId) {
		return targetMapper.selectByPrimaryKey(targetId);
	}


}
