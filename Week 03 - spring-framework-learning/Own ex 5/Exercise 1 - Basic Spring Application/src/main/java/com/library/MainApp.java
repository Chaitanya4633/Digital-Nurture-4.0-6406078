package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        // Load Spring context from classpath
        try (ClassPathXmlApplicationContext ctx =
                 new ClassPathXmlApplicationContext("applicationContext.xml")) {

            BookService service = ctx.getBean(BookService.class);
            service.printAvailableBooks();   // prints three titles
        }
    }
}
