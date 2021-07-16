package com.example.demo_book_club.model.user_info;


import com.example.demo_book_club.common.MemberStatus;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Entity
@Table(name = "club_member")
@Inheritance(strategy = InheritanceType.JOINED)
public class ClubMember extends User {

    @Column(name = "status", nullable = false)
    @Enumerated(value = EnumType.STRING)
    private MemberStatus status;
}
