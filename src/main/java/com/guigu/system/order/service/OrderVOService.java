package com.guigu.system.order.service;

import java.util.List;

import com.guigu.system.po.OrderVO;

public interface OrderVOService {
	
	public List<OrderVO> findList(OrderVO orderVO);

}
