package com.example.demo_book_club.common;

import lombok.Getter;

@Getter
public enum MemberStatus {
    ACTIVE("Active"), EXPIRED("Expired");

    private final String name;

    MemberStatus(String name) {
        this.name = name;
    }
}
