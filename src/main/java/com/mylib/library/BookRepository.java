package com.mylib.library;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mylib.library.Book;
	
@Repository
public interface BookRepository extends CrudRepository<Book, Long>  {
		
}









