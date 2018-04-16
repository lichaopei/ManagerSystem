package com.guigu.system.po.mapper;

import java.util.List;
import com.guigu.system.po.TempVO;
public interface TempVOMapper {
	public List<TempVO> findList(Integer departmentID);
}
