package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
/*************************************************************
* @author        Anjali Sharma
* Description    It is an entity class  of order list
* Version        1.0
* Created Date   16-JULY-2020 
*************************************************************/


@Entity
@Table(name = "Order_List")
public class OrderList {

	@Id
	@Column(name = "Order_Id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(generator="orderId_gen",strategy = GenerationType.SEQUENCE)
	private Integer orderId;
	
	@Column(name = "Quantity")
	private Integer qty;
	
	@Column(name = "Total")
	private float total;
	
	@Column(name = "Order_Status")
	private String status;
	
	@Column(name = "Payment_Method")
	
	private String payment;
	
	@Column(name = "Order_Date")
	@DateTimeFormat(pattern="dd.MM.yyyy")
	private  Date date;

	public OrderList() {
		
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

	public OrderList(Integer orderId, Integer qty, float total, String status, String payment,Date date) {
		super();
		this.orderId = orderId;
		this.qty = qty;
		this.total = total;
		this.status = status;
		this.payment = payment;
		this.date=date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
}