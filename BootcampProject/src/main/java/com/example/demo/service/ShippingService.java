package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Shipping;


public interface ShippingService {

	public List<Shipping> showallshipping();
	
	public String updateShipping(Shipping shipping);
	
}
