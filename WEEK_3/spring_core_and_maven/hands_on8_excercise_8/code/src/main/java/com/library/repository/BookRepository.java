package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository  // 👈 registers bean as 'bookRepository'
public class BookRepository {

    public void saveBook(String bookName) {
        System.out.println("Saving book: " + bookName);
    }
}
