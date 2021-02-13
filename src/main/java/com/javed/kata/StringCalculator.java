package com.javed.kata;

import java.util.regex.Pattern;

public class StringCalculator {

    public int add(String numbers) throws Exception{
        int sum = 0;
        if(!numbers.isEmpty()) {
            if(numbers.startsWith("//[")){
                String[] temp = numbers.split("\n",2);
                String del = temp[0].substring(3,temp[0].length()-1);
                sum = getSum(temp[1],Pattern.quote(del));
            }else if(numbers.startsWith("//")){
                String[] temp = numbers.split("\n",2);
                String del = temp[0].substring(2);
                sum = getSum(temp[1],Pattern.quote(del));
            }else {
                sum = getSum(numbers, "[,\n]");
            }
        }
        return sum;
    }

    private int getSum(String numbers, String del) throws Exception{
        int sum = 0;
        int negativeSum = 0;
        String[] nums = numbers.split(del);
        for (String num : nums) {
            int i=Integer.parseInt(num);
            if (i<0){
                negativeSum+=i;
            }else if(i<=1000) {
                sum += i;
            }
        }
        if(negativeSum!=0){
            throw new Exception(String.format("negatives not allowed, %d",negativeSum));
        }
        return sum;
    }
}
