package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Order_Table")
public class Order {
	
	@Id
	@Column(name="order_id")
	private Integer orderId;
	
	@Column(name="customerId")
	private Integer customerId;

	@Column(name="customername")
	private  String customerName;

	@Column(name="bookId")
	private Integer bookId;

	@Column(name="Amount")
	private Float amount;
	
	@Column(name="Orderaddress")
	private String address;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Order(int orderId, int customerId, String customerName,int bookId,Float amount,String address) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.bookId = bookId;
		this.amount = amount;
		this.address = address;
		
	}
	
	public Order() {
		super();
	}
	
	@Override
	public String toString() {
		return "Order[orderId=" + orderId +", customerId=" + customerId +", customerame=" + customerName +", bookId=" + bookId +", amount=" + amount +", address=" + address +"]";
	}
}
