package com.example.TestUF2406.RestController;


import com.example.TestUF2406.Model.Book;
import com.example.TestUF2406.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookRestController {

    @Autowired
    BookService bookService;


    @GetMapping("/books")
    public Iterable<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/books{id}")
    public Optional<Book> findOneBookById(@PathVariable Long id){
        return bookService.findOneBookById(id);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @DeleteMapping("/books{id}")
    public void deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
    }

}
