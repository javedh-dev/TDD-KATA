package com.javed.kata;

public class StringCalculator {

    public int add(String numbers){
        int sum = 0;
        if(!numbers.isEmpty()) {
            if(numbers.startsWith("//")){
                String[] temp = numbers.split("\n",2);
                String del = temp[0].substring(2);
                sum = getSum(temp[1],del);
            }else {
                sum = getSum(numbers, "[,\n]");
            }
        }
        return sum;
    }

    private int getSum(String numbers, String del) {
        int sum = 0;
        String[] nums = numbers.split(del);
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
