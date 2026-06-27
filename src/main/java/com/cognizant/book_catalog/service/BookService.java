package com.cognizant.book_catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.book_catalog.entity.Book;
import com.cognizant.book_catalog.repository.BookRepository;

@Service
public class BookService {
@Autowired
	BookRepository repo;

public void addBook(Book b) {
	// TODO Auto-generated method stub
	repo.save(b);
}

public Book getbyid(Integer id) {
	// TODO Auto-generated method stub
	return repo.findById(id).orElseThrow(()->new RuntimeException("idnotfound"));
}

public void updatebook(Integer id, Book b) {
	// TODO Auto-generated method stub
	Book exist=repo.findById(id).orElseThrow(()->new RuntimeException("idnotfound"));
exist.setTitle(b.getTitle());
exist.setAuthor(b.getAuthor());
exist.setGenre(b.getGenre());
exist.setPublishedYear(b.getPublishedYear());
exist.setTotalCopies( b.getTotalCopies());
exist.setAvailableCopies(b.getAvailableCopies());
repo.save(exist);

}

public Book getbookdetails(String title) {
	// TODO Auto-generated method stub
	return repo.findByTitle(title).orElseThrow(()->new RuntimeException("titlenotfound"));
}

public List<Book> getallbooks(){
 return	repo.findAll();
	
}
public void deletebookbyid(Integer id) {
	Book exist=repo.findById(id).orElseThrow(()->new RuntimeException("idnotfound"));
	repo.deleteById(id);
}

public void patchupdate(Integer id,Book b) {
	// TODO Auto-generated method stub
	Book exist=repo.findById(id).orElseThrow(()->new RuntimeException("idnotfound"));
if(b.getTitle()!=null)
	exist.setTitle(b.getTitle());
if (b.getAuthor()!=null)
exist.setAuthor(b.getAuthor());
if (b.getGenre()!=null)
	exist.setGenre(b.getGenre());
if (b.getPublishedYear()!=null)
	exist.setPublishedYear(b.getPublishedYear());
if (b.getTotalCopies()!=null)
	exist.setTotalCopies( b.getTotalCopies());
if (b.getAvailableCopies()!=null)
	exist.setAvailableCopies(b.getAvailableCopies());
	repo.save(exist);

}
	



}
