package com.guigu.system.order.service;

import java.util.List;
import com.guigu.system.po.PhotoType;

public interface PhotoTypeService {
	public List<PhotoType> findList(PhotoType photoType);
	
	public PhotoType findOne(Integer typeId);
	
	public boolean save(PhotoType photoType);
	
	public boolean update(PhotoType photoType);
	
	public boolean delete(Integer typeId);

}
