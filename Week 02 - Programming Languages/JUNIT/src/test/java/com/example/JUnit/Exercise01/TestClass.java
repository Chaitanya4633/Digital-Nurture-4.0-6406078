package com.example.JUnit.Exercise01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    void testAddition() {
        assertEquals(5, 2 + 3);
    }
}
