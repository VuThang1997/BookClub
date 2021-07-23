package com.example.demo_book_club.dto;

import lombok.Getter;

@Getter
public class FindBookRequest {

    private final String title;
    private final String author;

    public FindBookRequest(String bookName, String bookAuthor) {
        this.title = bookName;
        this.author = bookAuthor;
    }
}
