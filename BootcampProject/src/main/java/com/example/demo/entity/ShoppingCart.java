package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Shopping")
public class ShoppingCart {
	
	@Id
	@GeneratedValue(generator="customerId_gen",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="customerID_gen",initialValue = 1010,allocationSize = 1)
	private int book_Id;
//	private String book_name;
	private String userId;
	private int quantity;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public ShoppingCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ShoppingCart(String userId, int book_Id, int quantity) {
		super();
		this.userId = userId;
		this.book_Id = book_Id;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ShoppingCart [userId=" + userId + ", book_Id=" + book_Id + ", quantity="
				+ quantity + "]";
	}
	
	
	
	
	

}
