package com.example.demo_book_club.model.user_info;


import com.example.demo_book_club.common.MemberStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "member")
@Inheritance(strategy = InheritanceType.JOINED)
public class Member extends User {

    @Column(name = "status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private MemberStatus status;

    public Member(String name, String phone, MemberStatus status) {
        super(name, phone);
        this.status = status;
    }
}
