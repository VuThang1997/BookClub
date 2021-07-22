package com.example.demo_book_club.model.user_info;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "guest")
public class Guest extends User {

    @Column(name = "cid")
    private String cid;

    public Guest(String name, String phone, String cid) {
        super(name, phone);
        this.cid = cid;
    }
}
