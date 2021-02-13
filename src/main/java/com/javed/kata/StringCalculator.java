package com.javed.kata;

public class StringCalculator {

    public int add(String numbers){
        int sum = 0;
        if(!numbers.isEmpty()) {
            String[] nums = numbers.split(",");
            if(nums.length==2){
                sum = Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
            }else {
                sum = Integer.parseInt(nums[0]);
            }
        }
        return sum;
    }
}
