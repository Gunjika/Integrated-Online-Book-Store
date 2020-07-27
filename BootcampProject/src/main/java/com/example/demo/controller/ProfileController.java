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

import com.example.demo.entity.Profile;
import com.example.demo.exception.ProfileException;
import com.example.demo.service.ProfileService;


@RestController
public class ProfileController {
	
	@Autowired
	private ProfileService profileservice;
	
	@PostMapping("/addProfile")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<String> addProfile(@Validated @RequestBody Profile profile, BindingResult br)throws ProfileException{
		String err = "";
		if(br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new ProfileException(err);
		}
		try {
			profileservice.addProfile(profile);
			return new ResponseEntity<String>("Profile added Successfully", HttpStatus.OK);
		} catch (DataIntegrityViolationException ex) {
			throw new ProfileException("Already Exists");
		}
	}
	
	@PutMapping("/updateProfile/{profileId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity updateProfile(@Validated @RequestBody Profile profile,@PathVariable Integer profileId,BindingResult br)throws ProfileException
	{
		String err = "";
		if (br.hasErrors()) {
			List<FieldError> errors = br.getFieldErrors();
			for (FieldError error : errors)
				err += error.getDefaultMessage() + "<br/>";
			throw new ProfileException(err);
		}
		try {
			profileservice.updateProfile(profile, profileId);
			return new ResponseEntity<String>("Profile Updated", HttpStatus.OK);
		}catch (DataIntegrityViolationException ex) {
			throw new ProfileException("Profile Already exists");			
		}
	}
	
	@GetMapping("/getProfile/{profileId}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Optional<Profile> viewProfile(@PathVariable Integer profileId) throws ProfileException{
		try {
			return profileservice.viewProfile(profileId);
		}
		catch(Exception ex) {
			throw new ProfileException(ex.getMessage());
		}
	}
}
