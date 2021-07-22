package com.example.demo_book_club.model.book_info;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
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

    @Column(name = "name", nullable = false, updatable = false)
    private String name;

    @Column(name = "author", nullable = false, updatable = false)
    private String author;              // no need to group author to new entity

    @OneToMany(mappedBy = "book", orphanRemoval = true)
    private Set<BookCategory> bookCategories;

    public Book(String name, String author, Set<BookCategory> bookCategories) {
        this.name = name;
        this.author = author;
        this.bookCategories = bookCategories;
    }
}
