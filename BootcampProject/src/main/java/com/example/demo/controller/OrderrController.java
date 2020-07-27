package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Order;
import com.example.demo.exception.OrderException;
import com.example.demo.service.OrderrService;

@RestController
public class OrderrController {
	@Autowired
	private OrderrService orderService;
	
	@CrossOrigin
	@PostMapping("/addOrder")
	public ResponseEntity<String> AddOrder(@Validated @RequestBody Order order, BindingResult br)throws OrderException{
		String err = "";
		if(br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new OrderException(err);
		}
		try {
			orderService.AddOrder(order);
			return new ResponseEntity<String>("Order Submitted Successfully", HttpStatus.OK);
		} catch (DataIntegrityViolationException ex) {
			throw new OrderException("Already Exists");
		}
	}
	
	@CrossOrigin
	@GetMapping("/viewallorder")
	public ResponseEntity<List<Order>> getAllorder() {
		List<Order> orderList = orderService.showallorder();
		return new ResponseEntity<List<Order>>(orderList, HttpStatus.OK);
	}

}
