package com.example.demo_book_club.repository;

import com.example.demo_book_club.model.book_info.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
