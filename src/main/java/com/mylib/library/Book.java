package com.mylib.library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books")

public class Book {
	
	/*
	 * Creating the book table.
	 * The table will have ID, title and author of the book as values.
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	private String bookTitle;
	private String author;
	
	public Book() {

	}

	public Book(Long ID, String bookTitle, String author) {
	    this.ID = ID;
	    this.bookTitle = bookTitle;
	    this.author = author;
	}
	
	public Long getID() {
		return ID;
	}
	public void setID(Long ID) {
		this.ID = ID;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
