package com.example.task2;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class Calculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = "[,|\n]";

        if (numbers.startsWith("//")) {
            int delimiterStart = numbers.indexOf("//")+ 2;
            int delimiterEnd = numbers.indexOf('\n');
            String customDelimiter = numbers.substring(delimiterStart,delimiterEnd);

            delimiter="[" + Pattern.quote(customDelimiter)+ "|\n]";
            numbers = numbers.substring(delimiterEnd+ 1);

            }


        String[] numArray = numbers.split(delimiter);

       if (numbers.contains(",\n")) {
           throw new IllegalArgumentException("Contains ',\\n'");

        }
        int sum = 0;
        List<String> negatives = new ArrayList<>();

        for (String num : numArray) {
            if(!num.isEmpty()) {
                int parseNum = Integer.parseInt(num);
                if (parseNum < 0) {
                    negatives.add(String.valueOf(parseNum));
                } else if (parseNum <= 1000) {
                    sum += parseNum;
                }
            }
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negatives not allowed " + String.join(",", negatives));
        }


        return sum;
    }


}




