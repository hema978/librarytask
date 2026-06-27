package com.cognizant.book_catalog.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.book_catalog.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	Optional<Book> findByTitle(String title);

}
