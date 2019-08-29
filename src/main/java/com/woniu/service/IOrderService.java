package com.woniu.service;

import java.util.List;

import com.woniu.entity.Order;

public interface IOrderService {
      
	public void save(Order order);
	public List findOrder(Integer status);
	public void updateStatus(Order order);
}
