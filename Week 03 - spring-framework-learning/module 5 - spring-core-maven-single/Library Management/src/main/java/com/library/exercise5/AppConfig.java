package com.library.exercise5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig 
{
    @Bean
    public GreetingService greetingService() 
    {
        return new GreetingService();
    }
}
