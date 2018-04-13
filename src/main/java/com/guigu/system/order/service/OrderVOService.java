package com.guigu.system.order.service;

import java.util.List;

import com.guigu.system.po.OrderVO;
import com.guigu.system.po.Orders;

public interface OrderVOService {
	
	public List<OrderVO> findList(OrderVO orderVO);
	
	public boolean  save(Orders order);
	
	public boolean update(Orders order);
	
	public OrderVO findOne(int orderId);
	
	public boolean delete(int orderId);

}
