package edu.icet.repository;

import edu.icet.Entity.BookEntity;
import edu.icet.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity,Integer> {

    List<BookEntity> findByTitle(String title);
    List<BookEntity> findByCategory(String category);
    List<BookEntity> findByAuthorId(Integer authorId);
}

