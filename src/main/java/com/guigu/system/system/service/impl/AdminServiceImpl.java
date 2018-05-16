package com.guigu.system.system.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.po.Admin;
import com.guigu.system.po.AdminExample;
import com.guigu.system.po.AdminExample.Criteria;
import com.guigu.system.po.mapper.AdminMapper;
import com.guigu.system.system.service.AdminService;
@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService{
	@Resource(name="adminMapper")
	private AdminMapper adminMapper;

	@Override
	public List<Admin> findList(Admin admin) {
		AdminExample adminExample=new AdminExample();
		Criteria criteria=adminExample.createCriteria();
		if(admin!=null) {
			if(admin.getAdminName()!=null) {
				admin.setAdminName("%"+admin.getAdminName()+"%");
				criteria.andAdminNameLike(admin.getAdminName());
			}
		}
		return adminMapper.selectByExample(adminExample);
	}

	@Override
	public Admin findOne(Integer adminId) {
		return adminMapper.selectByPrimaryKey(adminId);
	}

	@Override
	public boolean save(Admin admin) {
		try {
			int i = adminMapper.insert(admin);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean update(Admin admin) {
		try {
			int i = adminMapper.updateByPrimaryKey(admin);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean delete(Integer adminId) {
		try {
		int i=adminMapper.deleteByPrimaryKey(adminId);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public Admin login(Admin admin) {
		AdminExample adminExample=new AdminExample();
		Criteria criteria=adminExample.createCriteria();
		if(admin.getAdminAccount()!=null && admin.getAdminPwd()!=null) {
			criteria.andAdminAccountEqualTo(admin.getAdminAccount());
			criteria.andAdminPwdEqualTo(admin.getAdminPwd());
		}
		List<Admin> admins=adminMapper.selectByExample(adminExample);
		if(!admins.isEmpty()) {
			return admins.get(0);
		}
		return null;
	}

}
