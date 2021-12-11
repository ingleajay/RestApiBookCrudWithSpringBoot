package com.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.doa.BookRepository;
import com.books.model.Book;


@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	public Book createbook(Book b) {
		this.bookRepository.save(b);
		return b;
	}
	
	public List<Book> getallbook(){
		return this.bookRepository.findAll();
	}
	
	public int deletebook(int bookid) {
		this.bookRepository.deleteById(bookid);
		return bookid;
	}
	
	public Book updatebook(int bookid , Book b) {
		this.bookRepository.save(b);
		return b;
	}
}
