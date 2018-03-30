package com.guigu.system.construct.service;

import java.util.List;
import com.guigu.system.po.Position;

public interface PositionService {
	public List<Position> findList(Position position);
	
	public Position findOne(Integer positionId);
	
	public boolean save(Position position);
	
	public boolean update(Position position);
	
	public boolean delete(Integer positionId);

}
