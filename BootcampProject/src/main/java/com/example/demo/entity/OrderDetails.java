package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Details")
public class OrderDetails {

	@Id
	@GeneratedValue(generator="customerId_gen",strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Order_Id")
	
	private Integer orderId;
	
	@Column(name = "Quantity")
	private Integer qty;
	
	@Column(name = "SubTotal")
	private float subtotal;
	
	@Column(name = "Total")
	private float total;
	
	@Column(name = "Order_Status")
	private String status;
	
	@Column(name = "Payment_Method")
	private String payment;
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private BookDetails bookDetails;

	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	public OrderDetails(BookDetails bookDetails) {
		super();
		this.bookDetails = bookDetails;
	}

	public OrderDetails(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public OrderDetails() {
		
	}

	public OrderDetails(Integer orderId, 
			 Integer qty, float subtotal, float total, String status, String payment) {
		super();
		this.orderId = orderId;
		this.qty = qty;
		this.subtotal = subtotal;
		this.total = total;
		this.status = status;
		this.payment = payment;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	

}