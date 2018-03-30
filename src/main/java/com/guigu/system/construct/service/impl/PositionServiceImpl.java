package com.guigu.system.construct.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.construct.service.PositionService;
import com.guigu.system.po.Position;
import com.guigu.system.po.PositionExample;
import com.guigu.system.po.PositionExample.Criteria;
import com.guigu.system.po.mapper.PositionMapper;
@Service("positionServiceImpl")
public class PositionServiceImpl implements PositionService{
	@Resource(name="positionMapper")
	private PositionMapper positionMapper;

	@Override
	public List<Position> findList(Position position) {
		PositionExample positionExample=new PositionExample();
		Criteria criteria=positionExample.createCriteria();
		if(position!=null) {
			if(position.getPositionName()!=null) {
				position.setPositionName("%"+position.getPositionName()+"%");
				criteria.andPositionNameLike(position.getPositionName());
			}
		}
		return positionMapper.selectByExample(positionExample);
	}

	@Override
	public Position findOne(Integer positionId) {
		return positionMapper.selectByPrimaryKey(positionId);
	}

	@Override
	public boolean save(Position position) {
		try {
			int i = positionMapper.insert(position);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean update(Position position) {
		try {
			int i = positionMapper.updateByPrimaryKey(position);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean delete(Integer positionid) {
		try {
			int i = positionMapper.deleteByPrimaryKey(positionid);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

}
