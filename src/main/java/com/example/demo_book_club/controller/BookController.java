package com.example.demo_book_club.controller;

import com.example.demo_book_club.dto.FindBookRequest;
import com.example.demo_book_club.dto.FindBookResponse;
import com.example.demo_book_club.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/book")
    public FindBookResponse findBook(@RequestParam(value = "bookName", required = false) String bookName,
                                     @RequestParam(value = "author", required = false) String author) {

        final var request = new FindBookRequest(bookName,author);
        return bookService.findBook(request);
    }
}
