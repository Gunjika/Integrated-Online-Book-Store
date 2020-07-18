package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.entity.Customer;


@Service
@Transactional
public class CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	public boolean addCustomer(Customer customer)
	{
		return customerDao.save(customer) != null;
	}
	
	public Optional<Customer> Customerdetails(Integer customerId)
	{
		return customerDao.findById(customerId);
	}
	
	public List<Customer> show()
	{
		return customerDao.findAll();
	}
	
	public Customer updateCustomer(Customer customer,int customerId)
	{
		return customerDao.save(customer);
	}

}