package com.curso.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.curso.example.service.OrderService;

@Component
public class OrderServiceClient {

	private OrderService orderService;

    //@Autowired is no longer required in Spring 4.3 and later.
    public OrderServiceClient (OrderService orderService) {
        this.orderService = orderService;
    }

    public void showPendingOrderDetails (String id) {
        System.out.println(orderService.getOrderDetails(id));
    }
}