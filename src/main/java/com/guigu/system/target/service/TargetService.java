package com.guigu.system.target.service;

import java.util.List;

import com.guigu.system.po.Target;
import com.guigu.system.po.TargetLevel;

public interface TargetService {
	
	public  List<Target> findList(Target target);
	
	public boolean save(Target target);
	
	public boolean delete(int targetId);
	
	public boolean update(Target target);
	
	public Target findOne(int targetId);

}
