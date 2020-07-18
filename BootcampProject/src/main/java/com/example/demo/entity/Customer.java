package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Customer")
@DynamicUpdate(true)
@DynamicInsert(true)
@SequenceGenerator(name="customerID_gen",initialValue = 1,allocationSize = 50)
public class Customer {
	
	@GeneratedValue(generator="customerId_gen",strategy = GenerationType.SEQUENCE)
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="name")
	private String fullname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="zipcode")
	private String zipcode;
	
	@Column(name="country")
	private String country;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Customer(int customerId,String fullname,String email,String password,String phonenumber,String address,String city,String zipcode,String country) {
		super();
		this.customerId = customerId;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
	}
	
	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Customer[customerId=" + customerId +", fullname=" + fullname +", email=" + email +", password=" + password +", phonenumber=" + phonenumber +", address=" + address +", city=" + city +", zipcode=" + zipcode +", country=" + country +"]";
	}
}
