package com.library.exercise9.controller;

import com.library.exercise9.entity.Book;
import com.library.exercise9.repository.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController 
{

    private final BookRepository repo;

    public BookController(BookRepository repo) 
    {
        this.repo=repo;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book create(@RequestBody Book book) 
    {
        return repo.save(book);
    }

    @GetMapping
    public List<Book> findAll() 
    {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Long id) 
    {
        return repo.findById(id)
                   .orElseThrow(() -> new RuntimeException("Book "+id+" not found"));
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book updated) 
    {
        return repo.findById(id).map(b -> {
            b.setTitle(updated.getTitle());
            b.setAuthor(updated.getAuthor());
            return repo.save(b);
        }).orElseThrow(() -> new RuntimeException("Book "+id+" not found"));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) 
    {
        repo.deleteById(id);
    }
}
