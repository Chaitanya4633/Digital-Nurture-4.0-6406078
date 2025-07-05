package com.library.exercise9.repository;

import com.library.exercise9.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
   
