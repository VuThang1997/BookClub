package com.example.demo_book_club.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@EqualsAndHashCode
@Getter
@ToString
@Entity
@Table(name = "book_category")
public class BookCategory {

    @Id
    private int id;

    @Column(name = "category_name", nullable = false, unique = true)
    private String categoryName;

}
