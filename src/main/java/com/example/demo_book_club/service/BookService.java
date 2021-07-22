package com.example.demo_book_club.service;

import com.example.demo_book_club.dto.FindBookRequest;
import com.example.demo_book_club.dto.FindBookResponse;
import com.example.demo_book_club.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public FindBookResponse findBook(FindBookRequest request) {
        // find by name
        // find by author
        // find by category
        // find by combo of them
        // ---> not good for simple derived query
    }
}
