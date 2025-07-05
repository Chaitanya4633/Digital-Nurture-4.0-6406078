package com.library.exercise5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp 
{
    public static void main(String[] args) 
    {
        try (AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class)) 
        {
            GreetingService gs=ctx.getBean(GreetingService.class);
            gs.greet();
        }
    }
}
