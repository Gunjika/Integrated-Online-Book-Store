package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;

public interface OrderrService {
	boolean AddOrder(Order order);

    List<Order> showallorder();


}
