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
 * @author Anjali Sharma Description It is an Entity class of bookDetails
 *         Version 1.0 Created Date 15-JULY-2020
 *************************************************************/

@Entity
@Table(name = "Book_details")
public class BookDetails {

	/**
	 * It is a primary key of entity table book details
	 **/
	@Id
	@Column(name = "Book_Id")
	@GeneratedValue(generator="customerId_gen",strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bookId;
	/**
	 * It is a name of the book
	 **/

	@Column(name = "Title")
	private String title;
	/**
	 * It is a author of the book
	 **/

	@Column(name = "Author")
	private String author;
	/**
	 * It specifies the description of the book
	 **/

	@Column(name = "Description")
	private String description;
	/**
	 * It is a ISBN no of the book
	 **/

	@Column(name = "ISBN")
	private String isbn;

	/**
	 * It is image od the specific book
	 **/
	@Column(name = "Image")
	private String img;
	/**
	 * It is a price of the book
	 **/

	@Column(name = "Price")
	private float price;
	/**
	 * It is the publish date of the book
	 **/
	@Column(name = "Publish_Date")
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date date;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(final Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(final String isbn) {
		this.isbn = isbn;
	}

	public String getImg() {
		return img;
	}

	public void setImg(final String img) {
		this.img = img;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(final float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	/*************************************************************
	 * @author Anjali Sharma Description It is a method of entity class bookDetails
	 *         Version 1.0 Created Date 15-JULY-2020
	 *************************************************************/
	public BookDetails() {

	}

	public BookDetails(final Integer bookId, final String title,
			 final String author,
			 final String description,
			 final String isbn, final String img,
			final float price, final Date date) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.isbn = isbn;
		this.img = img;
		this.price = price;
		this.date = date;
	}

}