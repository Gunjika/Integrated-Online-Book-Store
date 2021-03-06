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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Addbooktocart;
import com.example.demo.exception.AddbooktocartException;
import com.example.demo.service.AddbooktocartService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AddbooktocartController {
	
	@Autowired
	private AddbooktocartService addbooktocartservice;
	
	@PostMapping("/addAddbooktocart")
	public ResponseEntity<String> addAddbooktocart(@Validated @RequestBody Addbooktocart addbooktocart, BindingResult br)throws AddbooktocartException{
		String err = "";
		if(br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new AddbooktocartException(err);
		}
		try {
			addbooktocartservice.addAddbooktocart(addbooktocart);
			return new ResponseEntity<String>("book added Successfully", HttpStatus.OK);
		} catch (DataIntegrityViolationException ex) {
			throw new AddbooktocartException("Already Exists");
		}
	}
	
	@GetMapping("/viewallAddbooktocart")
	public ResponseEntity<List<Addbooktocart>> getlist(){
		List<Addbooktocart> addbooktocartList = addbooktocartservice.show();
		return new ResponseEntity<List<Addbooktocart>>(addbooktocartList, HttpStatus.OK);
	}
	
	@PutMapping("/updateAddbooktocart/{id}")
	public ResponseEntity updateAddbooktocart(@Validated @RequestBody Addbooktocart addbooktocart,@RequestParam Integer addbooktocartId,BindingResult br)throws AddbooktocartException
	{
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new AddbooktocartException(err);
		}
		try {
			addbooktocartservice.updateAddbooktocart(addbooktocart, addbooktocartId);
			return new ResponseEntity<String>("Addbooktocart Details Updated", HttpStatus.OK);
		}catch (DataIntegrityViolationException ex) {
			throw new AddbooktocartException("Addbooktocart Already exists");			
		}
	}
	
	@GetMapping("/getAddbooktocartdetails/{addbooktocartId}")
	public Optional<Addbooktocart> Addbooktocartdetails(@PathVariable Integer addbooktocartId) throws AddbooktocartException{
		try {
			return addbooktocartservice.Addbooktocartdetails(addbooktocartId);
		}
		catch(Exception ex) {
			throw new AddbooktocartException(ex.getMessage());
		}
	}
}
