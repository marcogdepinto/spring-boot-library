package com.mylib.library;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
class DirectoryTests {

	// Checking all files are in place 
	
	@Test
	public void bookExists() throws Exception {
		String directory = System.getProperty("user.dir");
		File file = new File(directory + "\\src\\main\\java\\com\\mylib\\library\\Book.java");
		assertTrue(file.exists());
	}
	
	@Test
	public void bookControllerExists() throws Exception {
		String directory = System.getProperty("user.dir");
		File file = new File(directory + "\\src\\main\\java\\com\\mylib\\library\\BookController.java");
		assertTrue(file.exists());
	}
	
	@Test
	public void bookRepositoryExists() throws Exception {
		String directory = System.getProperty("user.dir");
		File file = new File(directory + "\\src\\main\\java\\com\\mylib\\library\\BookRepository.java");
		assertTrue(file.exists());
	}
	
	@Test
	public void libraryApplicationExists() throws Exception {
		String directory = System.getProperty("user.dir");
		File file = new File(directory + "\\src\\main\\java\\com\\mylib\\library\\LibraryApplication.java");
		assertTrue(file.exists());
	}
	
	@Test
	public void bookServiceExists() throws Exception {
		String directory = System.getProperty("user.dir");
		File file = new File(directory + "\\src\\main\\java\\com\\mylib\\library\\BookService.java");
		assertTrue(file.exists());
	}
	
}
