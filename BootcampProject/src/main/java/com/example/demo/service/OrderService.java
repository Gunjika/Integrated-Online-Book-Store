package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Order;


@Service
@Transactional
public class OrderService {
	
	@Autowired
	OrderDao orderDao;
	
	public boolean submitOrder(Order order)
	{
		return orderDao.save(order) != null;
	}
	
	public Optional<Order> Orderdetails(Integer orderId)
	{
		return orderDao.findById(orderId);
	}
	
	public List<Order> show()
	{
		return orderDao.findAll();
	}
	
	

}
