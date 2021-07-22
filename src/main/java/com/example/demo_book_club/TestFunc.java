//package com.example.demo_book_club;
//
//import com.example.demo_book_club.common.MemberStatus;
//import com.example.demo_book_club.model.book_info.Book;
//import com.example.demo_book_club.model.user_info.Guest;
//import com.example.demo_book_club.model.user_info.Member;
//import com.example.demo_book_club.repository.BookRepository;
//import com.example.demo_book_club.repository.GuestRepository;
//import com.example.demo_book_club.repository.MemberRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Component
//public class TestFunc implements CommandLineRunner {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Autowired
//    private GuestRepository guestRepository;
//
//    @Autowired
//    private MemberRepository memberRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        addMember();
//    }
//
//    private void addBulkBooks() {
//        Set<Book> books = new HashSet<>();
//        for (int i = 0; i < 21; i++) {
//            Book book = new Book("name_" + i, "author_" + i, null);
//            books.add(book);
//        }
//
//        bookRepository.saveAll(books);
//    }
//
//    private void addGuest() {
//        var guest = new Guest("guest1", "phone1", "cid1");
//        guestRepository.save(guest);
//    }
//
//    private void addMember() {
//        var member = new Member("member1", "phone_member_1", MemberStatus.ACTIVE);
//        memberRepository.save(member);
//    }
//}
