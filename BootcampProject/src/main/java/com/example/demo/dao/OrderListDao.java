package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.OrderList;


/*************************************************************
 * @author        Anjali Sharma
 * Description    It is an interface jpa repository of orderList
 * Version        1.0
 * Created Date   16-JULY-2020 
 *************************************************************/
public interface OrderListDao extends JpaRepository<OrderList, Integer>{
	
	


}
