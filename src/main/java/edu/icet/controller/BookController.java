package edu.icet.controller;

import edu.icet.dto.Book;
import edu.icet.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/book")

public class BookController {

    final BookService service;
    @PostMapping("/add-book")
    public  void addBook( @RequestBody Book book){service.addBook(book);
    }
    @DeleteMapping("/delete-book/{id}")

    public void deletBook(@PathVariable Integer id){
        service.deletBook(id);
    }

    @PutMapping("/update-book")

    public void updateBook(@RequestBody Book book){
        service.updateBook(book);
    }

    @GetMapping("/getAll-book")

    public List<Book> getAllBook(){
       return service.getAllBook();
    }

    @GetMapping ("search-by-title/{title}")
    public List<Book> searchBytitle(@PathVariable String title){
        return service.searchBytitle(title);
    }

    @GetMapping("search-by-category/{category}")
     public List<Book>searchByCategory( @PathVariable String category){return service.searchBycategory(category);
    }
    @GetMapping("search-by-authorId/{authorId}")
    public List<Book>searchByauthorId(@PathVariable Integer authorId){return service.searchByauthorId(authorId);
    }


}


