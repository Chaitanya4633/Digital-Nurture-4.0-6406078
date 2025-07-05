package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> findAll() {
        return Arrays.asList("Effective Java","Clean Code","Design Patterns");
    }
}