package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.OrderVO;

public interface OrderVOMapper {
	public List<OrderVO> findList(OrderVO orderVO);
	
	public int insert(OrderVO orderVO);
	
	public int update(OrderVO orderVO);
	
	public int delete(int OrderId);

}
