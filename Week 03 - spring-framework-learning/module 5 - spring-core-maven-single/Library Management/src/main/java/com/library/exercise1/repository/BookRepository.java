package com.library.exercise1.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository 
{
    public List<String> findAll() 
    {
        return Arrays.asList
        (
            "1. Head First Java:",
            "2. Effective Java",
             "3. Clean Code",
             "4. Design Patterns",
             "5. Java: The Complete Reference",
             "6. Java Concurrency in Practice:",
             "7. Spring in Action:",
             "8. Test-Driven: TDD and Acceptance TDD for Java Developers",
             "9. Thinking in Java ",
             "10.Java: A Beginner's Guide"
        );
    }
}
