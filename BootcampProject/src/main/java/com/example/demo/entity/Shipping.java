package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="shipping_table")
public class Shipping {

@Id
@GeneratedValue(generator="shippingId_gen",strategy = GenerationType.SEQUENCE)
@Column(name="shipping_Id")
private Integer shippingId;

@Column(name="shipping_name")
private String shippingName;

@Column(name="shipping_street1")
private String shippingStreet1;

@Column(name="shipping_street2")
private String shippingStreet2;

@Column(name="shipping_city")
private String shippingCity;

@Column(name="shipping_state")
private String shippingState;

@Column(name="shipping_country")
private String shippingCountry;

@Column(name="shipping_zipcode")
private String shippingZipcode;




public Integer getShippingId() {
	return shippingId;
}

public void setShippingId(Integer shippingId) {
	this.shippingId = shippingId;
}

public String getShippingName() {
	return shippingName;
}

public void setShippingName(String shippingName) {
	this.shippingName = shippingName;
}

public String getShippingStreet1() {
	return shippingStreet1;
}

public void setShippingStreet1(String shippingStreet1) {
	this.shippingStreet1 = shippingStreet1;
}

public String getShippingStreet2() {
	return shippingStreet2;
}

public void setShippingStreet2(String shippingStreet2) {
	this.shippingStreet2 = shippingStreet2;
}

public String getShippingCity() {
	return shippingCity;
}

public void setShippingCity(String shippingCity) {
	this.shippingCity = shippingCity;
}

public String getShippingState() {
	return shippingState;
}

public void setShippingState(String shippingState) {
	this.shippingState = shippingState;
}

public String getShippingCountry() {
	return shippingCountry;
}

public void setShippingCountry(String shippingCountry) {
	this.shippingCountry = shippingCountry;
}

public String getShippingZipcode() {
	return shippingZipcode;
}

public void setShippingZipcode(String shippingZipcode) {
	this.shippingZipcode = shippingZipcode;
}

public Shipping(Integer shippingId, String shippingName,String shippingStreet1,String shippingStreet2,String shippingCity,String shippingState,String shippingCountry,String shippingZipcode) {
	super();
	this.shippingId = shippingId;
	this.shippingName = shippingName;
	this.shippingStreet1 = shippingStreet1;
	this.shippingStreet2 = shippingStreet2;
	this.shippingCity = shippingCity;
	this.shippingState = shippingState;
	this.shippingCountry = shippingCountry;
	this.shippingZipcode = shippingZipcode;
	
}

public Shipping() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Shipping [shippingId=" + shippingId + ", shippingName=" + shippingName +",shippingStreet1=" + shippingStreet1 +",shippingStreet2= " + shippingStreet2 + ",shippingCity= " + shippingCity + ",shippingState= " + shippingState + ",shippingCountry= " + shippingCountry + ",shippingZipcode= " + shippingZipcode + "]";
}


}