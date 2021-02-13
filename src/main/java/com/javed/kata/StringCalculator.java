package com.javed.kata;

public class StringCalculator {

    public int add(String numbers){
        int sum = 0;
        if(!numbers.isEmpty()) {
            String[] nums = numbers.split(",");
            sum = Integer.parseInt(nums[0]);
        }
        return sum;
    }
}
