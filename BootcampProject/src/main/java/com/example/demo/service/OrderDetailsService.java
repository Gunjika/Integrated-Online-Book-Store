package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderDetails;

public interface OrderDetailsService {
	List<OrderDetails> getOrderHistory();
	OrderDetails getOrderById(Integer OrderId);

}
