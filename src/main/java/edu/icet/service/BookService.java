package edu.icet.service;

import edu.icet.dto.Book;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    void deletBook(Integer id);

    void updateBook(Book book);

    List<Book> getAllBook();

    List<Book> searchBytitle(String title);
    List<Book> searchBycategory(String catogory);

    List<Book> searchByauthorId(Integer authorId);
}
