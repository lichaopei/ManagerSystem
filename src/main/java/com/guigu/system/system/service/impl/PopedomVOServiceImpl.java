package com.guigu.system.system.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import com.guigu.system.po.Admin;
import com.guigu.system.po.AdminPopedom;
import com.guigu.system.po.AdminPopedomExample;
import com.guigu.system.po.AdminPopedomExample.Criteria;
import com.guigu.system.po.PopedomVO;
import com.guigu.system.po.mapper.AdminMapper;
import com.guigu.system.po.mapper.AdminPopedomMapper;
import com.guigu.system.po.mapper.DepartmentMapper;
import com.guigu.system.po.mapper.PopedomVOMapper;
import com.guigu.system.system.service.PopedomVOService;
@Service("popedomVOServiceImpl")
public class PopedomVOServiceImpl implements PopedomVOService{
	@Resource(name="popedomVOMapper")
	private PopedomVOMapper popedomVOMapper;
	@Resource(name="adminPopedomMapper")
	private AdminPopedomMapper adminPopedomMapper;
	AdminPopedom adminPopedom=new AdminPopedom();
	@Resource(name="adminMapper")
	private AdminMapper adminMapper;
	@Resource(name="departmentMapper")
	private DepartmentMapper departmentMapper;

	@Override
	public PopedomVO findOne(Integer popedomID) {
		PopedomVO popedomVO=new PopedomVO();
		adminPopedom=adminPopedomMapper.selectByPrimaryKey(popedomID);
		try {
			BeanUtils.copyProperties(popedomVO, adminPopedom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		popedomVO.setAdminName(adminMapper.selectByPrimaryKey(adminPopedom.getAdminId()).getAdminName());
		popedomVO.setDepartmentName(departmentMapper.selectByPrimaryKey(adminPopedom.getDepartmentId()).getDepartmentName());
		return popedomVO;
	}

	@Override
	public boolean save(PopedomVO popedomVO) {
		int i=popedomVOMapper.save(popedomVO);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(PopedomVO popedomVO) {
		adminPopedom.setDepartmentId(popedomVO.getDepartmentId());
		adminPopedom.setAdminId(popedomVO.getAdminId());
		int i=adminPopedomMapper.updateByPrimaryKey(adminPopedom);
		if (i>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer popedomID) {
		int i=adminPopedomMapper.deleteByPrimaryKey(popedomID);
		if(i>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<PopedomVO> findList(PopedomVO popedomVO) {
		List<PopedomVO> list=popedomVOMapper.findList(popedomVO);
		return list;
	}

	@Override
	public List<Integer> findDept(Admin admin) {
		List<Integer> integers=new ArrayList<>();
		AdminPopedomExample example=new AdminPopedomExample();
		Criteria criteria=example.createCriteria();
		criteria.andAdminIdEqualTo(admin.getAdminId());
		List<AdminPopedom> list=adminPopedomMapper.selectByExample(example);
		for (AdminPopedom adminPopedom : list) {
			integers.add(adminPopedom.getDepartmentId());
		}
		return integers;
	}
}
