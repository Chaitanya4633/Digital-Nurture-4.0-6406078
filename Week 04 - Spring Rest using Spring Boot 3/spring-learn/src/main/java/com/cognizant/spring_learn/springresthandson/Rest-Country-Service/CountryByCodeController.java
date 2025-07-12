package com.cognizant.spring_learn.springresthandson.step4;

import com.cognizant.spring_learn.springresthandson.step1.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryByCodeController 
{

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryByCodeController.class);

    @Autowired
    private CountryByCodeService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable String code) throws CountryNotFoundException 
    {
        LOGGER.info("START getCountryByCode(): {}",code);
        return countryService.getCountryByCode(code);
    }
}
