package com.example.demo_book_club.repository;

import com.example.demo_book_club.model.user_info.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member, Integer> {
}
