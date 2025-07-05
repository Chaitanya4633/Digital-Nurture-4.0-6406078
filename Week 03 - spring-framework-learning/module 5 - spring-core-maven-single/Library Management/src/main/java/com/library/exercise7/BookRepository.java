package com.library.exercise7;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public List<String> findAll() {
        return Arrays.asList("Clean Code", "Effective Java", "Design Patterns");
    }
}
