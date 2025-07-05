package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public List<String> findAll() {
        // Pretend this comes from a DB
        return Arrays.asList(
            "Effective Java",
            "Clean Code",
            "Design Patterns"
        );
    }
}
