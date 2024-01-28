package com.example.task2;



public class Calculator {

    public static int add(String numbers) {
        if(numbers.isEmpty()){
            return 0;
        }
        String[]numArray =numbers.split("[,\n]");

        if (numbers.contains("[,\n]")) {
            throw new IllegalArgumentException("Invalid input");
        }

        int sum = 0;

        for (String num: numArray){
            sum += Integer.parseInt(num);
        }
        return sum;


        }



}

