package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.ShoppingCart;

public interface UpdateBookToCartService {
	boolean addBookToCart(ShoppingCart ShoppingCart);
	public ShoppingCart updateCart(ShoppingCart shoppingCart,int book_Id);
	void deleteAll();
	Optional<ShoppingCart> getBookById(int userid);
	List<ShoppingCart> getAllBook();
	String removeBook(Integer bookid);

}
