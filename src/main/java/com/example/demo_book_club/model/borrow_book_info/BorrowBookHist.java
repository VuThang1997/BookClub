package com.example.demo_book_club.model.borrow_book_info;

import com.example.demo_book_club.model.book_info.Book;
import com.example.demo_book_club.model.user_info.ClubMember;
import com.example.demo_book_club.model.user_info.User;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@ToString
@Entity
@Table(name = "borrow_book_hist")
public class BorrowBookHist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @CreationTimestamp
    @Column(name = "created_time", nullable = false, updatable = false)
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false, updatable = false)
    private ClubMember clubMember;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_borrower_id", nullable = false, updatable = false)
    private User bookBorrower;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id", nullable = false, updatable = false)
    private Book book;

    @Column(name = "borrow_date", nullable = false, updatable = false)
    private LocalDate borrowDate;

    @Column(name = "due_date", nullable = false, updatable = false)
    private LocalDate dueDate;

    @Column(name = "trust_fee", nullable = false, updatable = false, columnDefinition = "integer default 0")
    private long trustFee;

    @Column(name = "note", length = 1000)
    private String note;

}
