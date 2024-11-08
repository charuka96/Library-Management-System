package edu.icet.service.impl;

import edu.icet.Entity.BookEntity;
import edu.icet.dto.Book;
import edu.icet.repository.BookRepository;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class BookserviceImpl implements BookService {

 final BookRepository repository;
 final ModelMapper mapper;

    @Override
    public void addBook(Book book) {
    repository.save(mapper.map(book, BookEntity.class));
    }
    @Override
    public void deletBook(Integer id) {
        repository.deleteById(id);
    }
    @Override
    public void updateBook(Book book) {
        repository.save(mapper.map(book,BookEntity.class));
    }

    @Override
    public List<Book> getAllBook() {

    List<Book>bookList =new ArrayList<>();

    repository.findAll().forEach(books-> bookList.add(mapper.map(books,Book.class)));

        return bookList;
    }

    @Override
    public List<Book> searchBytitle(String title) {
        List<Book>bookList = new ArrayList<>();
        repository.findByTitle(title).forEach(bookstitle->bookList.add(mapper.map(bookstitle,Book.class)));
        return bookList;
    }

    @Override
    public List<Book> searchBycategory(String category) {
        List<Book>bookList = new ArrayList<>();
        repository.findByCategory(category).forEach(bookscatogory->bookList.add(mapper.map(bookscatogory,Book.class)));
        return bookList;
    }

    @Override
    public List<Book> searchByauthorId(Integer authorId) {
        List<Book>bookList = new ArrayList<>();
        repository.findByAuthorId(authorId).forEach(booksauthorid->bookList.add(mapper.map(booksauthorid,Book.class)));
        return bookList;
    }

}
