package com.guigu.system.order.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.guigu.system.order.service.OrderVOService;
import com.guigu.system.po.OrderVO;
import com.guigu.system.po.Orders;
import com.guigu.system.po.mapper.OrderVOMapper;
import com.guigu.system.po.mapper.OrdersMapper;

@Service("orderVOserviceImpl")
public class OrderVOserviceImpl implements OrderVOService {
	@Resource(name = "orderVOMapper")
	private OrderVOMapper orderVOMapper;
	
	@Resource(name="ordersMapper")
	private OrdersMapper ordersMapper;
	
	private OrderVO orderVO=new OrderVO();
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

	@Override
	public boolean save(Orders order) {
		try {
			int i = ordersMapper.insert(order);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public boolean update(Orders order) {
		try {
			int i =  ordersMapper.updateByPrimaryKey(order);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}

		return false;
	}

	@Override
	public OrderVO findOne(int orderId) {
		orderVO=orderVOMapper.findOne(orderId);
		if(orderVO!=null)
		return orderVO;
		else
		return orderVOMapper.find(orderId); 
		
	}

	@Override
	public boolean delete(int orderId) {
		try {
			int i =  ordersMapper.deleteByPrimaryKey(orderId);
			if (i > 0) {
				return true;
			}
		} catch (Exception e) {

		}
		return false;
	}
}
