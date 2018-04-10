package com.guigu.system.order.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.order.service.PhotoTypeService;
import com.guigu.system.po.PhotoType;
import com.guigu.system.po.PhotoTypeExample;
import com.guigu.system.po.PhotoTypeExample.Criteria;
import com.guigu.system.po.mapper.PhotoTypeMapper;
@Service("photoTypeServiceImpl")
public class PhotoTypeSerciceImpl implements PhotoTypeService{
	@Resource(name="photoTypeMapper")
	private PhotoTypeMapper photoTypeMapper;

	@Override
	public List<PhotoType> findList(PhotoType photoType) {
		PhotoTypeExample example=new PhotoTypeExample();
		Criteria criteria=example.createCriteria();
		if(photoType!=null) {
			if(photoType.getTypeName()!=null) {
				criteria.andTypeNameLike("%"+photoType.getTypeName()+"%");
			}
		}
		return photoTypeMapper.selectByExample(example);
	}

	@Override
	public PhotoType findOne(Integer typeId) {
		return photoTypeMapper.selectByPrimaryKey(typeId);
	}

	@Override
	public boolean save(PhotoType photoType) {
		int i=photoTypeMapper.insert(photoType);
		if(i>0) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean update(PhotoType photoType) {
		int i=photoTypeMapper.updateByPrimaryKeySelective(photoType);
		if(i>0) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean delete(Integer typeId) {
		int i=photoTypeMapper.deleteByPrimaryKey(typeId);
		if(i>0) {
			return true;
		}
		return false;
	}

}
