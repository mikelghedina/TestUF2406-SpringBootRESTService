package com.example.TestUF2406.Service;


import com.example.TestUF2406.Model.Book;
import com.example.TestUF2406.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Iterable<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book> findOneBookById(Long id){
        return bookRepository.findById(id);
    }

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}
