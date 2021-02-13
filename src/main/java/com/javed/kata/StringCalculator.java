package com.javed.kata;

public class StringCalculator {

    public int add(String numbers){
        int sum = 0;
        if(!numbers.isEmpty()) {
            String[] nums = numbers.split(",");
            for(String num : nums){
                sum+=Integer.parseInt(num);
            }
        }
        return sum;
    }
}
