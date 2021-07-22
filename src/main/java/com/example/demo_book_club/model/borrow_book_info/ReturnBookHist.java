package com.example.demo_book_club.model.borrow_book_info;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@ToString
@Entity
@Table(name = "return_book_hist")
public class ReturnBookHist {

    @Id
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private BorrowBookHist borrowBookHist;

    @CreationTimestamp
    @Column(name = "created_time", nullable = false, updatable = false)
    private LocalDateTime createdTime;

    @Column(name = "plus_fee", columnDefinition = "bigint default 0", nullable = false)
    private long plusFee;

    @Column(name = "return_date", nullable = false, updatable = false)
    private LocalDate returnDate;

    @Column(name = "note", length = 800)
    private String note;
}
