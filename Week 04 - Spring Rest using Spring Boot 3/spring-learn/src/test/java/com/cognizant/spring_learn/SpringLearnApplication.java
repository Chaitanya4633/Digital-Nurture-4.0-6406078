package com.cognizant.spring_learn;

import com.cognizant.spring_learn.springresthandson.step1.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START main()");
        SpringApplication.run(SpringLearnApplication.class, args);
        displayCountry();
        displayCountryScope();
        LOGGER.info("END main()");
    }

    public static void displayCountry() {
        LOGGER.info("START displayCountry()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = (Country) context.getBean("country");
        LOGGER.debug("Country: {}", country);
        LOGGER.info("END displayCountry()");
    }

    public static void displayCountryScope() {
        LOGGER.info("START displayCountryScope()");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country1 = (Country) context.getBean("country");
        Country country2 = (Country) context.getBean("country");
        LOGGER.debug("Singleton check: country1 == country2 ? {}", country1 == country2);

        Country proto1 = (Country) context.getBean("anotherCountry");
        Country proto2 = (Country) context.getBean("anotherCountry");
        LOGGER.debug("Prototype check: proto1 == proto2 ? {}", proto1 == proto2);

        LOGGER.info("END displayCountryScope()");
    }
}
