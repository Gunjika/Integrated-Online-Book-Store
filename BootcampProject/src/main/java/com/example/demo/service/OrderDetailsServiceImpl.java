package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderDetailsDao;
import com.example.demo.entity.OrderDetails;
import com.example.demo.exception.OrderNotFoundException;

@Service
@Transactional
public class OrderDetailsServiceImpl implements OrderDetailsService {
	
	    /**
	     *  It is autowired dao class named as orderDetailsDao
	    **/
        @Autowired
       
		private OrderDetailsDao orderDetailsDao;
        public OrderDetailsServiceImpl() {
        	
        }

        /**
         *  It is the implemented method of service class
         *  for the list of all the order details
        **/
		@Override
		public List<OrderDetails> getOrderHistory() {
				return orderDetailsDao.findAll();
			}
		@Override
		public OrderDetails getOrderById(Integer OrderId) {
			// TODO Auto-generated method stub
			Optional<OrderDetails> order=this.orderDetailsDao.findById(OrderId);
			if(order.isPresent())
			{
			return order.get();
			}
			else
			{
				throw new OrderNotFoundException("Record not found with id: "+OrderId);
			}
		}
		
}
