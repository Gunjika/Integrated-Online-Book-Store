package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UpdateBookToCartDao;
import com.example.demo.entity.ShoppingCart;

@Service
public class UpdateBookImpl implements UpdateBookToCartService {

	@Autowired
	UpdateBookToCartDao dao;

	@Override
	public boolean addBookToCart(ShoppingCart shoppingCart) {
		// TODO Auto-generated method stub
		ShoppingCart cart = dao.save(shoppingCart);
		if (cart != null) {
			return true;
		} else
			return false;
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dao.deleteAll();

	}

	@Override
	public ShoppingCart updateCart(ShoppingCart shoppingCart,int book_Id)
	{
		return dao.save(shoppingCart);
	}

	@Override
	public Optional<ShoppingCart> getBookById(int bookid) {
		// TODO Auto-generated method stub
		return dao.findById(bookid);
	}

	@Override
	public List<ShoppingCart> getAllBook() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String removeBook(Integer bookid) {
		dao.deleteById(bookid);
		// TODO Auto-generated method stub
		return "deleted";
	}

}
