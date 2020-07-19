package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.ErrorInfo;
import com.example.demo.exception.ShippingException;


@RestControllerAdvice
public class ShippingAdvice {
	
		@ExceptionHandler(value = {ShippingException.class})
		@ResponseStatus(code=HttpStatus.BAD_REQUEST)
		public ErrorInfo handleException1(Exception ex) {
			return new ErrorInfo(ex.getMessage());
		}

}
