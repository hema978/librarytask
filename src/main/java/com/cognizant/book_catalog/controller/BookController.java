package com.cognizant.book_catalog.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.book_catalog.entity.Book;
import com.cognizant.book_catalog.service.BookService;

@RestController

public class BookController {
	@Autowired
	BookService service;
	
	@PostMapping("/add")
	public String addBook(@RequestBody Book b) {
		service.addBook(b);
	return "add successfully";
	}

	@GetMapping("/{id}")
	public Book getbyid(@PathVariable Integer id)
	{
		return service.getbyid(id);
	}
	@PutMapping("/update/{id}")
	public String updateBook(@PathVariable Integer id,@RequestBody Book b )
	{
		service.updatebook(id,b);    //API
		return "update successfully";
	}
	@GetMapping("/name/{title}")
	public Book getbybookdetails(@PathVariable String title) {
	return service.getbookdetails(title);      //API
	}
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable Integer id) {
		service.deletebookbyid(id);   //API
		return "delete successfully";
	}
	@GetMapping("/fetchall")
	public List<Book> fetchall(){
	return service.getallbooks();
	}
	@PatchMapping("/patch/{id}")
	public String patchupdate(@PathVariable Integer id,@RequestBody Book b) {
		service.patchupdate(id,b);
		return "patch updated successfully";
	}
	
	}

