package com.cognizant.spring_learn.springresthandson.step3;

import com.cognizant.spring_learn.springresthandson.step1.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController 
{
    private static final Logger LOGGER=LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/country")
    public Country getCountryIndia() 
    {
        LOGGER.info("START getCountryIndia()");
        return countryService.getCountry();
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() 
    {
        LOGGER.info("START getAllCountries()");
        return countryService.getAllCountries();
    }
}
