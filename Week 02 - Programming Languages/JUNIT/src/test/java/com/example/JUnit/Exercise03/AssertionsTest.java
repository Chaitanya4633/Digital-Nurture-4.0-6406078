package com.example.JUnit.Exercise03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest 
{
    @Test
    void testAssertions() 
    {
        assertEquals(194,96+98);
        assertTrue(18>17);
        assertFalse(987<1024);
        assertNull(null);
        assertNotNull("JUnit");
    }
}
