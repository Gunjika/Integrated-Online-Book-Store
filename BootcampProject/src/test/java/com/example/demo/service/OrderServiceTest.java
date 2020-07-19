package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.OrderDetailsDao;
import com.example.demo.entity.OrderDetails;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
class OrderServiceTest {
	@Autowired
	private OrderDetailsService ticketBookingService;
	
	@MockBean
	private OrderDetailsDao ticketBookingDao;

	@Test
	void test() {
		OrderDetails order = new OrderDetails();
		order.setOrderId(1);
		order.setQty(5);
		order.setSubtotal(500);
		order.setTotal(550);
		order.setStatus("ordered");
		order.setPayment("COD");
Mockito.when(ticketBookingDao.save(order)).thenReturn(order);

	    assertThat(ticketBookingService.getOrderHistory()).isEqualTo(order);
	
	}
	
		
	}