package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.OrderException;


@RestControllerAdvice
public class OrderAdvice {
	@ExceptionHandler(value = {OrderException.class})
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public Error handleException1(Exception ex) {
		return new Error(ex.getMessage());
	}

}
