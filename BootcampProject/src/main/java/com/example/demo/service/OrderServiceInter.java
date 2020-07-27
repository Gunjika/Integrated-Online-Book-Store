package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;

public interface OrderServiceInter {
	boolean submitOrder(Order order);

    List<Order> showallorder();

}
