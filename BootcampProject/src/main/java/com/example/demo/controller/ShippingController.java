package com.example.demo.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Shipping;
import com.example.demo.exception.ShippingException;
import com.example.demo.service.ShippingService;


@RestController
public class ShippingController {

	@Autowired
	ShippingService shippingService;

	@CrossOrigin
	@GetMapping("/viewallshipping")
	public ResponseEntity<List<Shipping>> getallshipping() {
		List<Shipping> shippingList = shippingService.showallshipping();
		return new ResponseEntity<List<Shipping>>(shippingList, HttpStatus.OK);
	}

	
	
	
	
	@CrossOrigin
	@PutMapping("/updateShipping")
	public ResponseEntity<String> shippingCategory( @RequestBody Shipping shipping) {
		try {
			shippingService.updateShipping(shipping);
			return new ResponseEntity<String>("Shipping Updated", HttpStatus.OK);

		} catch (Exception e) {
			// TODO: handle exception
			throw new ShippingException(e.getMessage());
		}
	}
	
}