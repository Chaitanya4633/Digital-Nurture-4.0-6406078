package com.library.exercise7;

import java.util.List;

public class BookService 
{

    private BookRepository repository;   

    public BookService(BookRepository repository) 
    {
        System.out.println("Constructor called");
        this.repository=repository;
    }

    public void setBookRepository(BookRepository repository) 
    {
        System.out.println("Setter called");
        this.repository=repository;
    }

    public void printCatalog() 
    {
        List<String> books=repository.findAll();
        books.forEach(b->System.out.println(b));
    }
}
