package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderList;

/*********************************************************
 * @author        Anjali Sharma
 * Description    It is an service interface  of order List 
 * Version        1.0
 * Created Date   16-JULY-2020 
 *********************************************************/

public interface OrderServicee {

	/**
	 *  It specifies the method interface and shows the orderhistory
	**/
	List<OrderList> getOrderHistory();
	
	

}