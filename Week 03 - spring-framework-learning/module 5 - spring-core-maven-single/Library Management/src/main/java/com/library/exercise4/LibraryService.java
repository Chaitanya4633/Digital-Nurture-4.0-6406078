package com.library.exercise4;

import java.util.List;

public interface LibraryService 
{
    void addBook(String title);
    List<String> listBooks();
}
