package com.example.JUnit.Exercise03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    void testAssertions() {
        assertEquals(5, 2 + 3);
        assertTrue(4 > 2);
        assertFalse(5 < 2);
        assertNull(null);
        assertNotNull("JUnit");
    }
}
