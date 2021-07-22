package com.example.demo_book_club.dto;

import lombok.Getter;

@Getter
public class FindBookResponse {

    private final String bookInfo;

    public FindBookResponse(String bookInfo) {
        this.bookInfo = bookInfo;
    }
}
