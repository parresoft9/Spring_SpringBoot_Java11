package com.curso.example.service.impl;

import org.springframework.stereotype.Service;

import com.curso.example.dao.OrderDAO;
import com.curso.example.service.OrderService;

@Service
public class OrderServiceImpl1 implements OrderService {

	private OrderDAO orderDAO;

	public OrderServiceImpl1(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	public String getOrderDetails(String orderId) {
		return orderDAO.getOrderDetails(orderId);
	}
}