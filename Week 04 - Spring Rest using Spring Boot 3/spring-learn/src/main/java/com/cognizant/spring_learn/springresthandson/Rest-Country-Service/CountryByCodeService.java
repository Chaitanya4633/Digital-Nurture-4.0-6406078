package com.cognizant.spring_learn.springresthandson.step4;

import com.cognizant.spring_learn.springresthandson.step1.Country;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryByCodeService 
{

    public Country getCountryByCode(String code) throws CountryNotFoundException 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");

        for (Country c:countries) 
        {
            if (c.getCode().equalsIgnoreCase(code)) 
            {
                return c;
            }
        }

        throw new CountryNotFoundException("Country not found with code: " + code);
    }
}
