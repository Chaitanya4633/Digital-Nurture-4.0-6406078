package com.example.JUnit.Exercise04;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest 
{
    private Calculator calculator;

    @BeforeEach
    void setUp() 
    {
        calculator=new Calculator();
    }

    @Test
    void testAdd() 
    {
        assertEquals(5,calculator.add(2,3));
    }

    @AfterEach
    void tearDown() 
    {
        calculator = null;
    }
}
