package com.example.demo_book_club.service;

import com.example.demo_book_club.dto.FindBookRequest;
import com.example.demo_book_club.dto.FindBookResponse;
import com.example.demo_book_club.model.book_info.Book;
import com.example.demo_book_club.model.book_info.BookCategory;
import com.example.demo_book_club.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo_book_club.repository.BookRepository.*;

@Service
public class BookService {

    private final BookRepository bookRepository;

    private final EntityManager entityManager;

    @Autowired
    public BookService(BookRepository bookRepository, EntityManager entityManager) {
        this.bookRepository = bookRepository;
        this.entityManager = entityManager;
    }

    public FindBookResponse findBook(FindBookRequest request) {
       // validate request

        final String title = request.getTitle();
        final String author = request.getAuthor();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
        Root<Book> root = criteriaQuery.from(Book.class);
//        root.fetch("bookCategories");
        List<Predicate> predicates = new ArrayList<>(2);

        if (title != null) {
            predicates.add(titleContains(title).toPredicate(root, criteriaQuery, criteriaBuilder));
        }

        if (author != null) {
            predicates.add(authorContains(author).toPredicate(root, criteriaQuery, criteriaBuilder));
        }

        criteriaQuery.where(predicates.toArray(new Predicate[0]));
        TypedQuery<Book> query = entityManager.createQuery(criteriaQuery);
        List<Book> books = query.getResultList();

//        List<Book> books = bookRepository.findByTitleLikeAndAuthorLike(title, author);

        return new FindBookResponse(books.toString());
    }
}
