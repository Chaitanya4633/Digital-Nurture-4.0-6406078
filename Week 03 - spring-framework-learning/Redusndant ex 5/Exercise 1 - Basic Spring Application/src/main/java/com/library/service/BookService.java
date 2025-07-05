package com.library.service;

import com.library.repository.BookRepository;
import java.util.List;

public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void printAvailableBooks() {
        List<String> books = bookRepository.findAll();
        books.forEach(System.out::println);
    }
}