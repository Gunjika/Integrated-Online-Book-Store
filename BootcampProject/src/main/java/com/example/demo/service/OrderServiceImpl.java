package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.OrderListDao;
import com.example.demo.entity.OrderList;


/*********************************************************
 * @author        Anjali Sharma
 * Description    It is an implementation of orderdetails service 
 * Version        1.0
 * Created Date   16-JULY-2020 
 ********************************************************/

@Service
@Transactional
public class OrderServiceImpl implements OrderServicee {
	
	    /**
	     *  It is autowired dao class named as orderDetailsDao
	    **/
        @Autowired

	    /**
	     *  OrderListDao field is autowired in this class
	    **/
		private OrderListDao orderListDao;

	    /**
	     *  It is a constructor of OrderServiceImpl class
	    **/
        public OrderServiceImpl() {
        	
        }

        /**
         *  It is the implemented method of service class
         *  for the list of all the order details
        **/
        @Override
		public List<OrderList> getOrderHistory() {
				return orderListDao.findAll();
			}
		
}