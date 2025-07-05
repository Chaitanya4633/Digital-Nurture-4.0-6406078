package com.library.exercise1.service;

import com.library.exercise1.repository.BookRepository;
import java.util.List;

public class BookService 
{
    private final BookRepository repo;

    public BookService(BookRepository repo) 
    { 
        this.repo=repo; 
    }

    public void printAvailableBooks() 
    {
        List<String> books=repo.findAll();
        books.forEach(System.out::println);
    }
}
