package com.example.demo_book_club.model.user_info;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@ToString
@Entity
@Table(name = "leader")
public class Leader extends ClubMember {

    @Column(name = "title", nullable = false)
    private String title;
}
