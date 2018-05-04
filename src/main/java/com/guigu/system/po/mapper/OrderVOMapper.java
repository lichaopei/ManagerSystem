package com.guigu.system.po.mapper;

import java.util.List;

import com.guigu.system.po.EmpTestVO;
import com.guigu.system.po.OrderVO;

public interface OrderVOMapper {
	public List<OrderVO> findList(OrderVO orderVO);
	
	public int insert(OrderVO orderVO);
	
	public int update(OrderVO orderVO);
	
	public int delete(int OrderId);
	
	public OrderVO findOne(int OrderId);
	
	public OrderVO find(int OrderId);
	
	public double floorMoney(EmpTestVO empTestVO);
	
	public double makeUpMoney(EmpTestVO empTestVO);
	
	public double photoMoney(EmpTestVO empTestVO);
	
	public double psMoney(EmpTestVO empTestVO);
	
	public double chooseMoney(EmpTestVO empTestVO);
}
