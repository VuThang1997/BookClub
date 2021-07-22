package com.example.demo_book_club.dto;

import lombok.Getter;

@Getter
public class FindBookRequest {

    private final String bookName;
    private final String bookAuthor;

    public FindBookRequest(String bookName, String bookAuthor) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
    }
}
