package com.warehouse.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warehouse.order.model.Order;
import com.warehouse.order.repo.OrderRepository;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Integer saveOrder(Order order) {
		
		Order savedOrder = orderRepository.save(order);
		
		return savedOrder.getOrderId();
	}
	
	

}
