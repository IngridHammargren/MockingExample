package com.example.task2;



public class Calculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

            String delimiter = "[,\n]";

            if (numbers.startsWith("//")) {
                int delimiterIndex = numbers.indexOf("\n");
                delimiter = numbers.substring(2, delimiterIndex);
                numbers = numbers.substring(delimiterIndex + 1);
            }

            String[] numArray = numbers.split(delimiter);


            int sum = 0;

            for (String num : numArray) {
                int parseNum = Integer.parseInt(num);
                if(parseNum<0){
                    throw new IllegalArgumentException("negatives not allowed "+num);
                }
                sum += parseNum;

            }
            return sum;


        }



}

