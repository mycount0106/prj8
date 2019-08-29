package com.woniu.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.woniu.entity.Order;
import com.woniu.mapper.OrderMapper;
import com.woniu.mapper.RateMapper;
import com.woniu.service.IOrderService;
@Service
public class OrderServiceImpl implements IOrderService {
    @Resource
	private RateMapper rateMapper;
	@Resource
	private OrderMapper orderMapper;
	@Override
	public void save(Order order) {
		Double rate = rateMapper.findLoanRate(order.getDeadline());
		double a = order.getMoney() * rate * (Math.pow((1 + rate), order.getDeadline()));
		double b = Math.pow((1 + rate), (order.getDeadline())) - 1;
		BigDecimal bg = new BigDecimal(a / b);
		double f1 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		order.setMoneyonmonth(f1);
		order.setRate(rate);
		order.setOtime(new Date());
		
		System.out.println("赋值后的order"+order);
		orderMapper.insertSelective(order);

	}
	@Override
	public List findOrder(Integer status) {
		
		return orderMapper.findOrder(status);
	}
	@Override
	public void updateStatus(Order order) {
		orderMapper.updateByPrimaryKeySelective(order);
		
	}

}
