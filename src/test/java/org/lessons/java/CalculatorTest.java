package org.lessons.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5.0f, Calculator.add(2.0f, 3.0f), 0.01);
    }

    @Test
    void subtract() {
        assertEquals(-1.0f, Calculator.subtract(2.0f, 3.0f), 0.01);
    }

    @Test
    void divide() {
        assertEquals(2.0f, Calculator.divide(6.0f, 3.0f), 0.001);
        assertThrows(IllegalArgumentException.class, ()->Calculator.divide(10,0));
    }

    @Test
    void multiply() {
        assertEquals(6.0f, Calculator.multiply(2.0f, 3.0f), 0.001);
    }

}