package com.example.demo_book_club.model.club_info;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString
@Entity
@Table(name = "club_balance")
public class ClubBalance {

    // this table has only 1 record, no need to implement 1 id-generator for it

    @Id
    private Integer id;

    @UpdateTimestamp
    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    @Column(name = "current_balance", nullable = false)
    private long currentBalance;
}
