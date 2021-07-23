package com.example.demo_book_club.repository;

import com.example.demo_book_club.model.book_info.Book;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>, JpaSpecificationExecutor<Book> {

    static Specification<Book> titleContains(String pieceOfTitle) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("title"), "%" + pieceOfTitle + "%");
    }

    static Specification<Book> authorIs(String authorName) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("author"), authorName);
    }

    static Specification<Book> authorContains(String pieceOfName) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("author"), "%" + pieceOfName + "%");
    }

    List<Book> findByTitleLikeAndAuthorLike(String title, String author);
}
