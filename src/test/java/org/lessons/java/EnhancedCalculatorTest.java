package org.lessons.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class EnhancedCalculatorTest {
    Random rnd = new Random();

    @RepeatedTest(10)
    @DisplayName("Sum test")
    void add() {
        float num1 = rnd.nextFloat();
        float num2 = rnd.nextFloat();

        assertEquals(num1 + num2, Calculator.add(num1, num2), 0.01);
    }

    @RepeatedTest(10)
    @DisplayName("Multiplication test")
    void subtract() {
        float num1 = rnd.nextFloat();
        float num2 = rnd.nextFloat();
        assertEquals(num1- num2, Calculator.subtract(num1,num2), 0.01);
    }

    @RepeatedTest(10)
    @DisplayName("Division test")
    void divide() {
        float num1 = rnd.nextFloat();
        float num2 = rnd.nextFloat();
       if(num2 != 0){
           assertEquals(num1 / num2, Calculator.divide(num1,num2), 0.01);
       } else {
           assertThrows(IllegalArgumentException.class, ()->Calculator.divide(num1, num2));
       }
    }

    @RepeatedTest(10)
    @DisplayName("multiplication test")
    void multiply() {
        float num1 = rnd.nextFloat();
        float num2 = rnd.nextFloat();

        assertEquals(num1*num2, Calculator.multiply(num1,num2), 0.01);
    }
}