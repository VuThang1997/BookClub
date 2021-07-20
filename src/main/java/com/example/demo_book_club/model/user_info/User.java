package com.example.demo_book_club.model.user_info;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

}
