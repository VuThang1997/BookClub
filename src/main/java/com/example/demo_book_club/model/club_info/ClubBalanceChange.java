package com.example.demo_book_club.model.club_info;

import com.example.demo_book_club.model.user_info.Member;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@Entity
@Table(name = "club_balance_change")
public class ClubBalanceChange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    @Column(name = "created_time", nullable = false, updatable = false)
    private LocalDateTime createdTime;

    @Column(name = "old_balance", nullable = false, updatable = false)
    private long oldBalance;

    @Column(name = "amount", nullable = false, updatable = false)
    private long amount;

    @Column(name = "new_balance", nullable = false, updatable = false)
    private long newBalance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "who_update", nullable = false, updatable = false)
    private Member whoUpdate;

    @Column(name = "note", length = 1000)
    private String note;
}
