package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service   // 👈 registers this class as a Spring bean with id = "bookService"
public class BookService {

    private BookRepository bookRepository;
    private String libraryName;

    // Constructor Injection — optional with @Autowired
    public BookService() {
        this.libraryName = "City Library";
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println("[" + libraryName + "] Adding book: " + bookName);
        bookRepository.saveBook(bookName);
    }
}
