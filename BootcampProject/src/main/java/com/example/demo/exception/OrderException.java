package com.example.demo.exception;

import java.util.List;

import com.example.demo.entity.Order;

public class OrderException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public OrderException() {
		super();
	}
	
	public OrderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	
	public OrderException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public OrderException(String message) {
		super(message);
	}
	
	public OrderException(Throwable cause) {
		super(cause);
	}
	
	public List<Order> show(){
		return null;
	}

}