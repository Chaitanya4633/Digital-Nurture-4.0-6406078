package com.library.exercise9.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book 
{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;

    public Book() { }

    public Book(String title,String author) 
    {
        this.title=title;
        this.author=author;
    }

    public Long getId()     
    { 
      return id; 
    }

    public String getTitle()  
    { 
      return title; 
    }

    public String getAuthor() 
    { 
      return author; 
    }

    public void setTitle(String title)   
    { 
      this.title = title; 
    }

    public void setAuthor(String author) 
    { 
      this.author=author; 
    }
}
