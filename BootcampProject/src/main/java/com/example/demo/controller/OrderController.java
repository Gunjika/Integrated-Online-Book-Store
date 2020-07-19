package com.example.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.exception.OrderException;
import com.example.demo.service.OrderService;


@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	@PostMapping("/submitorder")
	public ResponseEntity<String> submitOrder(@Validated @RequestBody Order order, BindingResult br)throws OrderException{
		String err = "";
		if(br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new OrderException(err);
		}
		try {
			orderservice.submitOrder(order);
			return new ResponseEntity<String>("Order Submitted Successfully", HttpStatus.OK);
		} catch (DataIntegrityViolationException ex) {
			throw new OrderException("Already Exists");
		}
	}
	
	@GetMapping("/viewallorder")
	public ResponseEntity<List<Order>> getlist(){
		List<Order> orderList = orderservice.show();
		return new ResponseEntity<List<Order>>(orderList, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getorderdetails/{orderId}")
	public Optional<Order> Orderdetails(@PathVariable Integer orderId) throws OrderException{
		try {
			return orderservice.Orderdetails(orderId);
		}
		catch(Exception ex) {
			throw new OrderException(ex.getMessage());
		}
	}
}