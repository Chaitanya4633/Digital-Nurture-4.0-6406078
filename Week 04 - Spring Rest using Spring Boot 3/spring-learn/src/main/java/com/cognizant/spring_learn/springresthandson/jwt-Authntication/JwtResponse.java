package com.cognizant.spring_learn.springresthandson.step5;

public class JwtResponse 
{
    private String token;

    public JwtResponse(String token) 
    {
        this.token=token;
    }

    public String getToken() 
    {
        return token;
    }
}
