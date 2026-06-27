package com.cognizant.book_catalog.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid ;  //PK for book table
	 private String title;
	 private String author;
	 private String genre;
	 private Integer publishedYear;
	 private Integer totalCopies;
	 private Integer availableCopies;
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(Integer publishedYear) {
		this.publishedYear = publishedYear;
	}
	public Integer getTotalCopies() {
		return totalCopies;
	}
	public void setTotalCopies(Integer totalCopies) {
		this.totalCopies = totalCopies;
	}
	public Integer getAvailableCopies() {
		return availableCopies;
	}
	public void setAvailableCopies(Integer availableCopies) {
		this.availableCopies = availableCopies;
	}
	public Book(Integer bookid, String title, String author, String genre, Integer publishedYear, Integer totalCopies,
			Integer availableCopies) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publishedYear = publishedYear;
		this.totalCopies = totalCopies;
		this.availableCopies = availableCopies;
	}
	public Book() {
		super();
	}
}
