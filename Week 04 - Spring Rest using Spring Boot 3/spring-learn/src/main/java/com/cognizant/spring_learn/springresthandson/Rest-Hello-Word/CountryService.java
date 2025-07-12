package com.cognizant.spring_learn.springresthandson.step3;

import com.cognizant.spring_learn.springresthandson.step1.Country;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryService
{
    public Country getCountry() 
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
        return (Country) context.getBean("country");
    }

    public List<Country> getAllCountries() 
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("country.xml");
        return (List<Country>) context.getBean("countryList");
    }
}
