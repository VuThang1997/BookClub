package com.example.demo_book_club.model.user_info;

import com.example.demo_book_club.model.club_info.Department;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@ToString
@Entity
@Table(name = "normal_member")
public class NormalMember extends ClubMember {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
}
