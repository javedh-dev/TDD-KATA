package com.javed.kata;

import org.junit.Test;

public class StringCalculatorTest {

    @Test
    public void testEmptyString(){
        StringCalculator calculator = new StringCalculator();
        assert calculator.add("")==0;
    }

}
