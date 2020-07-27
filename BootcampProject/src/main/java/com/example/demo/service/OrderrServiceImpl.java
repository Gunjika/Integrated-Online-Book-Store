package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDao;
import com.example.demo.entity.Order;

@Transactional
@Service
public class OrderrServiceImpl implements OrderrService{

	@Autowired
	OrderDao orderDao;

	@Override
	public boolean AddOrder(Order order) {
		Order testresult = orderDao.save(order);
		if (testresult != null) {
			return true;
		} else
			return false;
	}

	@Override
	public List<Order> showallorder() {
		return orderDao.findAll();
	}

}
