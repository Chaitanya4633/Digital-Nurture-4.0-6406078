package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner 
{

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) 
    {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception 
    {
        System.out.println("START\n");

        implementServicesForManagingCountry();
        findCountryByCode();
        addNewCountry();
        demonstrateQueryMethods();
        demonstrateORMapping();
        demonstrateHQLandNativeQuery();

        System.out.println("\nEND");
    }


    private void implementServicesForManagingCountry() 
    {
        System.out.println("\nExercise 1: Implement services for managing Country");
        List<Country> countries = countryService.getAllCountries();
        countries.forEach(System.out::println);
    }

    private void findCountryByCode() 
    {
        System.out.println("\nExercise 2: Find a country based on country code");
        try 
        {
            Country country = countryService.findCountryByCode("IN");
            System.out.println("Fetched country by code IN: " + country);
        } 
        catch (CountryNotFoundException e) 
        {
            System.out.println("Country not found!");
        }
    }

    private void addNewCountry() 
    {
        System.out.println("\nExercise 3: Add a new country");
        Country country = new Country();
        country.setCode("IN");
        country.setName("India");
        countryService.addCountry(country);
        System.out.println("Added country: " + country);
    }

    private void demonstrateQueryMethods() 
    {
        System.out.println("\nExercise 4: Query method using findByNameContaining()");
        List<Country> countries = countryService.findByNameContaining("Uni");
        countries.forEach(System.out::println);
    }

    private void demonstrateORMapping() 
    {
        System.out.println("\nExercise 5: Demonstrate O/R Mapping");
        List<Country> countries = countryService.getAllCountries();
        countries.forEach(country -> System.out.println("Mapped Country: " + country));
    }

    private void demonstrateHQLandNativeQuery() 
    {
        System.out.println("\nExercise 6: HQL - Countries sorted by name");
        List<Country> hqlCountries = countryService.getAllCountriesSortedByName();
        hqlCountries.forEach(System.out::println);

        System.out.println("\nExercise 6: Native SQL - Countries with name starting with 'U'");
        List<Country> nativeCountries = countryService.getCountriesStartingWith("U");
        nativeCountries.forEach(System.out::println);
    }
}
