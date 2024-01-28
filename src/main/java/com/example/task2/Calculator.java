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

            if (numbers.contains(",\n")) {
                throw new IllegalArgumentException("Invalid input, needs a new line after comma");
            }

            int sum = 0;

            for (String num : numArray) {
                sum += Integer.parseInt(num);
            }
            return sum;


        }



}

