package com.example.demo_book_club.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table(name = "book")
public class Book {

    // - Book (id, name, author, category, price, status)

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_id_gen")
    @SequenceGenerator(name = "book_id_gen", sequenceName = "book_id_gen", allocationSize = 1)
    private Integer id;

    @Column(name = "name", nullable = false, updatable = false)
    private String name;

    @Column(name = "author", nullable = false, updatable = false)
    private String author;              // no need to group author to new entity

//    @OneToMany
//    private Set<BookCategory> bookCategories;



}
