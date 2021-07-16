package com.example.demo_book_club.model;

import com.example.demo_book_club.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestMain implements CommandLineRunner {

    @Autowired private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 21; i++) {
            Book book = new Book();
            book.setName("test" + i);
            book.setAuthor("author" + i);

            bookRepository.save(book);
        }
    }
}
