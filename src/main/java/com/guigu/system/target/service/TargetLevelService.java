package com.guigu.system.target.service;

import java.util.List;

import com.guigu.system.po.TargetLevel;

public interface TargetLevelService {
	
	public  List<TargetLevel> findList(TargetLevel targetLevel);
	
	public boolean save(TargetLevel targetLevel);
	
	public boolean delete(int levelId);
	
	public boolean update(TargetLevel targetLevel);
	
	public TargetLevel findOne(int levelId);

}
