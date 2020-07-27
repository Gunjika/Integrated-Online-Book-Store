package com.example.demo.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*************************************************************
 * @author Anjali Sharma Description It is an entity class of customerDetails
 *         Version 1.0 Created Date 16-JULY-2020
 *************************************************************/
@Entity
@Table(name = "Customer_Table")
public class CustomerDetails {
	/**
	 * It is a primary key of entity table cutomer details
	 **/
	@Id
	@Column(name = "Cust_Id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(generator="custId_gen",strategy = GenerationType.SEQUENCE)
	private Integer custId;

	/**
	 * It specifies the name of the customer
	 **/
	@Column(name = "CustFullName")
	private String custFullName;
	/**
	 * It specifies the email of the customer
	 **/
	@Column(name = "emailId")
	private String emailId;
	/**
	 * It specifies the password of the customer
	 **/

	@Column(name = "userPaswword")
	private String userPassword;
	/**
	 * It specifies the phone number of the customer
	 **/

	@Column(name = "phoneNo")
	private String phoneNo;
	/**
	 * It specifies the address of the customer
	 **/
	@Column(name = "Address")
	private String address;
	/**
	 * It specifies the city of the customer
	 **/

	@Column(name = "CityName")
	private String cityName;

	/**
	 * It specifies the zip code of the customer
	 **/
	@Column(name = "ZipCode")
	private String zipCode;

	/**
	 * It specifies the country of the customer
	 **/
	@Column(name = "CountryName")
	private String countryName;

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustFullName() {
		return custFullName;
	}

	public void setCustFullName(String custFullName) {
		this.custFullName = custFullName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * It specifies the default consructor of the customer details
	 **/
	public CustomerDetails() {

	}

	/*************************************************************
	 * @author Anjali Sharma Description It is an constructor of cusomerDetails
	 *************************************************************/

	public CustomerDetails(Integer custId, String custFullName, String emailId, String userPassword, String phoneNo,
			String address, String cityName, String zipCode, String countryName) {
		super();
		this.custId = custId;
		this.custFullName = custFullName;
		this.emailId = emailId;
		this.userPassword = userPassword;
		this.phoneNo = phoneNo;
		this.address = address;
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.countryName = countryName;
	}

}