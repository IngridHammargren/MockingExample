package com.example.task2;


import java.util.ArrayList;
import java.util.List;

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
        List<String> negatives = new ArrayList<>();

        for (String num : numArray) {
            int parseNum = Integer.parseInt(num);
            if (parseNum < 0) {
                negatives.add(String.valueOf(parseNum));
            } else if (parseNum<=1000) {
                sum +=parseNum;
            }

        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed " + String.join(",", negatives));
        }


        return sum;
    }


}




