package com.javed.kata;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringCalculatorTest {

    private final StringCalculator calculator = new StringCalculator();

    @DisplayName("Empty string returned 0")
    @Test
    public void testEmptyString(){
        assert calculator.add("")==0;
    }

    @DisplayName("One number is returned as it is.")
    @Test
    public void testOneNumber(){
        assert calculator.add("4")==4;
    }

    @DisplayName("Two number are summed and returned.")
    @Test
    public void testTwoNumbers(){
        assert calculator.add("4,5")==9;
    }

    @DisplayName("Multiple number should be summed.")
    @Test
    public void testMultipleNumbers(){
        assert calculator.add("5,2,8")==15;
    }

    @DisplayName("Add numbers with newline as well as comma")
    @Test
    public void testNewlineNumbers(){
        assert calculator.add("1\n2,3")==6;
    }

    @DisplayName("Add numbers with custom delimiter")
    @Test
    public void testCustomDelimiter(){
        assert calculator.add("//;\n1;2;3")==6;
    }

    @DisplayName("Throws exception on negative numbers")
    @Test
    public void testNegativeNumbers(){
        Exception exception = assertThrows(Exception.class, () -> {
            calculator.add("-1,-2,3");
        });

        String expectedMessage = "negatives not allowed, -3";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
