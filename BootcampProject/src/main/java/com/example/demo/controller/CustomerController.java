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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Customer;
import com.example.demo.exception.CustomerException;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCusotmer(@Validated @RequestBody Customer customer, BindingResult br)throws CustomerException{
		String err = "";
		if(br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new CustomerException(err);
		}
		try {
			customerservice.addCustomer(customer);
			return new ResponseEntity<String>("Customer added Successfully", HttpStatus.OK);
		} catch (DataIntegrityViolationException ex) {
			throw new CustomerException("Already Exists");
		}
	}
	
	@GetMapping("/viewallCustomer")
	public ResponseEntity<List<Customer>> getlist(){
		List<Customer> customerList = customerservice.show();
		return new ResponseEntity<List<Customer>>(customerList, HttpStatus.OK);
	}
	
	@PutMapping("/updateCustomer/{id}")
	public ResponseEntity updateCustomer(@Validated @RequestBody Customer customer,@RequestParam Integer customerId,BindingResult br)throws CustomerException
	{
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new CustomerException(err);
		}
		try {
			customerservice.updateCustomer(customer, customerId);
			return new ResponseEntity<String>("Customer Details Updated", HttpStatus.OK);
		}catch (DataIntegrityViolationException ex) {
			throw new CustomerException("Customer Already exists");			
		}
	}
	
	@GetMapping("/getCustomerdetails/{customerId}")
	public Optional<Customer> Customerdetails(@PathVariable Integer customerId) throws CustomerException{
		try {
			return customerservice.Customerdetails(customerId);
		}
		catch(Exception ex) {
			throw new CustomerException(ex.getMessage());
		}
	}
}