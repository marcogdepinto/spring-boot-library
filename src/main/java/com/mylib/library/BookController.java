package com.mylib.library;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/books")

public class BookController {
	
	/*
	 * This is the controller of the application.
	 * It is used to map URLs to actual actions.
	 * With /add it will be possible to add a new book to the database.
	 * With /all it will be possible to return the list of all books.
	 * With /get/{id} it will be possible to search books using the ID.
	 */

	@Autowired 
	private BookRepository bookRepository;
		
		// New book POST
		@PostMapping(path="/add")
		public @ResponseBody String addNewBook (
				@RequestParam String bookTitle , @RequestParam String author) {
		    Book b = new Book();
		    b.setBookTitle(bookTitle);
		    b.setAuthor(author);
		    bookRepository.save(b);
		    return "Saved";
		}

	  // Get all books in the DB
	  @GetMapping(path = "/all")
	  public Iterable<Book> getAllBooks() throws Exception {
	      return bookRepository.findAll();
	  }
	  
	  // Get books by ID 
	  @GetMapping(value = "/get/{id}")
	  public Optional<Book> getBookById(@PathVariable("id") Long id) throws Exception {
	      return bookRepository.findById(id);
	  }
	  
}