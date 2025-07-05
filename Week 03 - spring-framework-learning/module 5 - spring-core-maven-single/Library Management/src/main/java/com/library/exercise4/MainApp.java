package com.library.exercise4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp 
{

    public static void main(String[] args) 
    {
        try (AnnotationConfigApplicationContext ctx=
            new AnnotationConfigApplicationContext(LibraryConfig.class)) {

            LibraryService library=ctx.getBean(LibraryService.class);

            library.addBook("Clean Code");
            library.addBook("Effective Java");
            library.addBook("Design Patterns");

            System.out.println("Current Library Collection:");
            library.listBooks().forEach(title -> System.out.println( title));
        }
    }
}
