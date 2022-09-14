package com.curso.example.dao.impl;

import org.springframework.stereotype.Repository;

import com.curso.example.dao.OrderDAO;

@Repository
public class OrderDAOImpl implements OrderDAO {

    public String getOrderDetails(String orderId) {
        return "Order details from impl 1, for order id=" + orderId;
    }
}