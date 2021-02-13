package com.javed.kata;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

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

}
