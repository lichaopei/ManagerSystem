package com.guigu.system.system.service;

import java.util.List;

import com.guigu.system.po.Admin;

public interface AdminService {
	public List<Admin> findList(Admin admin);
	
	public Admin findOne(Integer adminId);
	
	public boolean save(Admin admin);
	
	public boolean update(Admin admin);
	
	public boolean delete(Integer adminId);
	
	public Admin login(Admin admin);
}
