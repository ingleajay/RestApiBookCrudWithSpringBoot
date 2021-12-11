package com.books.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int book_id;
	
	@Column(name="Name")
	private String book_name;
	
	@Column(name="Author")
	private String book_author;
	
	@Column(name="Description")
	private String book_description;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_description() {
		return book_description;
	}

	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}

	public Book(int book_id, String book_name, String book_author, String book_description) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_description = book_description;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_author=" + book_author
				+ ", book_description=" + book_description + "]";
	}
}
