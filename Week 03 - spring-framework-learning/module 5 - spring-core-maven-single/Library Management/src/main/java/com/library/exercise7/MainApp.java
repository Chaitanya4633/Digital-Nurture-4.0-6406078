package com.library.exercise7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    public static void main(String[] args) 
    {
        try (ClassPathXmlApplicationContext ctx=
                 new ClassPathXmlApplicationContext("exercise7-context.xml")) {

            BookService service=ctx.getBean(BookService.class);
            System.out.println("Catalog:");
            service.printCatalog();
        }
    }
}
