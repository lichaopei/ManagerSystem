package com.guigu.system.order.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.guigu.system.order.service.OrderVOService;
import com.guigu.system.po.OrderVO;
import com.guigu.system.po.mapper.OrderVOMapper;

@Service("orderVOserviceImpl")
public class OrderVOserviceImpl implements OrderVOService {
	@Resource(name = "orderVOMapper")
	private OrderVOMapper orderVOMapper;

	@Override
	public List<OrderVO> findList(OrderVO orderVO) {
		if (orderVO != null) {
			if (orderVO.getCustomer() != null) {
				orderVO.setCustomer("%" + orderVO.getCustomer() + "%");
				System.out.println(orderVO.getCustomer());
			}
		}
		return orderVOMapper.findList(orderVO);
	}
}
