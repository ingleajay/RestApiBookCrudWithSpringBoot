package com.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.model.Book;
import com.books.services.BookService;

@RestController
@RequestMapping("/book")
public class BooksController {

	@Autowired
	private BookService bookService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/add")
	public Book PostBook(@RequestBody Book b) {
		this.bookService.createbook(b);
		System.out.println(b);
		return b;
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/get")
	public List<Book> GetBook(){
		return this.bookService.getallbook();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/delete/{bookid}")
	public void DeleteBook(@PathVariable("bookid") int book_id) {
		this.bookService.deletebook(book_id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/update/{bookid}")
	public Book UpdateBook( @RequestBody Book b, @PathVariable("bookid") int book_id) {
		this.bookService.updatebook(book_id, b);
		return b;
	}
}
