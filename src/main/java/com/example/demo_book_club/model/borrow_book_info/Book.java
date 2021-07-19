package com.example.demo_book_club.model.borrow_book_info;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

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

}
