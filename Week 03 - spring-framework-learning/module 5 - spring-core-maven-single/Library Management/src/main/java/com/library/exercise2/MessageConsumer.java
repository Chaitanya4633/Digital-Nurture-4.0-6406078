package com.library.exercise2;

public class MessageConsumer 
{
    private final MessageService service;
   
    public MessageConsumer(MessageService service) 
    { 
        this.service = service; 
    }

    public void process() 
    { 
        System.out.println("Processing: " + service.getMessage()); 
    }
}
