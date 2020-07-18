package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class OrderNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public OrderNotFoundException(String message){
		super(message);
		
	}
	public 	OrderNotFoundException(String message,Throwable throwable){
		super(message,throwable);
		
	}
	public OrderNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public OrderNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}