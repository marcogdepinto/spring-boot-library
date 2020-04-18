package com.mylib.library;

import org.springframework.stereotype.Service;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

import com.mylib.library.Book;
import com.mylib.library.BookRepository;

@Service
public class BookService {
	
	BookRepository bookRepository;

	public Optional<Book> findById(@Param("ID") Long ID) {
		return bookRepository.findById(ID);
	}

}
