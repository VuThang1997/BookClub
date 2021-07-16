package com.example.demo_book_club.model.club_info;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@ToString
@Entity
@Table(name = "department")
public class Department {

    @Id
    private int id;

    @Column(name = "department_name", nullable = false, unique = true)
    private String departmentName;

}
