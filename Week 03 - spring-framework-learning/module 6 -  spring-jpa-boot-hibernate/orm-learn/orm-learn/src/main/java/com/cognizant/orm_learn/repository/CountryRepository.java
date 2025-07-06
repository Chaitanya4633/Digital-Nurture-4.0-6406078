package com.cognizant.orm_learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.orm_learn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> 
{


    List<Country> findByNameContainingOrderByNameAsc(String keyword);

    @Query("SELECT c FROM Country c ORDER BY c.name ASC")
    List<Country> getAllCountriesSortedByName();

    @Query(value="SELECT * FROM country WHERE co_name LIKE ?1%",nativeQuery=true)
    List<Country> getCountriesStartingWith(String keyword);
}
