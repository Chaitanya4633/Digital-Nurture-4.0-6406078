package com.library.exercise1;

import com.library.exercise1.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
    public static void main(String[] args) 
    {
        try (ClassPathXmlApplicationContext ctx=new 
        ClassPathXmlApplicationContext("applicationcontext.xml")) 
        {
            BookService service=ctx.getBean(BookService.class);

            System.out.println("");
            service.printAvailableBooks();
             System.out.println("");
        }
    }
}
