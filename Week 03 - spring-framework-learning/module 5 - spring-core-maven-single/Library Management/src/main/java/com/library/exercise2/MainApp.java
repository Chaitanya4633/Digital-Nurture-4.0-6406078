package com.library.exercise2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) 
    {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("exercise2-context.xml")) {
            MessageConsumer consumer = ctx.getBean(MessageConsumer.class);
            consumer.process();
        }
    }
}
