package com.guigu.system.order.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.guigu.system.order.service.OrderVOService;
import com.guigu.system.po.OrderVO;

@Controller
@RequestMapping("/order/order/")
public class OrderVOController {
	@Resource(name="orderVOserviceImpl")
	private OrderVOService orderVOService;
	@RequestMapping("list.action")
	public String list(OrderVO orderVO,Model model) {
		List<OrderVO> list=orderVOService.findList(orderVO);
		model.addAttribute("list", list);
		return "/order/order/order_list";
	}
	
}
