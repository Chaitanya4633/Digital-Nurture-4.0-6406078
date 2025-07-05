package com.library.exercise4;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service       
public class LibraryServiceImpl implements LibraryService 
{
    private final List<String> catalog=new ArrayList<>();

    @Override
    public void addBook(String title) 
    {
        catalog.add(title);
    }

    @Override
    public List<String> listBooks() 
    {
        return Collections.unmodifiableList(catalog);
    }
}
