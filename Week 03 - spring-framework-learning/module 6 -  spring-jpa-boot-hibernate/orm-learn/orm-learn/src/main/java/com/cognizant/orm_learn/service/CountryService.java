package com.cognizant.orm_learn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@Service
public class CountryService 
{

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() 
    {
        return countryRepository.findAll();
    }

    @Transactional
    public Country findCountryByCode(String code) throws CountryNotFoundException 
    {
        Optional<Country> result=countryRepository.findById(code);
        if (!result.isPresent()) 
        {
            throw new CountryNotFoundException("Country with code " + code + " not found");
        }
        return result.get();
    }

    @Transactional
    public void addCountry(Country country) 
    {
        countryRepository.save(country);
    }

    @Transactional
    public void updateCountry(String code, String name) throws CountryNotFoundException 
    {
        Country country=findCountryByCode(code);
        country.setName(name);
        countryRepository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) 
    {
        countryRepository.deleteById(code);
    }

    @Transactional
    public List<Country> findByNameContaining(String keyword) 
    {
        return countryRepository.findByNameContainingOrderByNameAsc(keyword);
    }

    public List<Country> getAllCountriesSortedByName() 
    {
        return countryRepository.getAllCountriesSortedByName();
    }

    public List<Country> getCountriesStartingWith(String keyword) 
    {
        return countryRepository.getCountriesStartingWith(keyword);
    }

}
