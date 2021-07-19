package com.example.demo_book_club.model.borrow_book_info;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@ToString
@Entity
@Table(name = "category")
public class Category {

    @Id
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany
    private Set<BookCategory> bookCategories;
}
