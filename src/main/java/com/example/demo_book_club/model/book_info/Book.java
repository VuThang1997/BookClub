package com.example.demo_book_club.model.book_info;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode
@Getter
@ToString
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", nullable = false, updatable = false)
    private String title;

    @Column(name = "author", nullable = false, updatable = false)
    private String author;              // no need to group author to new entity

    @OneToMany(mappedBy = "book", orphanRemoval = true)
    private Set<BookCategory> bookCategories;

    // JPA force each Entity has 1 public/protected no-arg constructor
    protected Book() {
        this.title = "Init";
        this.author = "Init";
        this.bookCategories = new HashSet<>(10);
    }

    public Book(String name, String author, Set<BookCategory> bookCategories) {
        this.title = name;
        this.author = author;
        this.bookCategories = bookCategories;
    }
}
