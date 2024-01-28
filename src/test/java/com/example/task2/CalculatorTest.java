package com.example.task2;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    @DisplayName("empty String Should Result in Zero")
    void emptyStringShouldResultInZero() {
       int result = Calculator.add("");
       assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("Given 1 then return 1")
    void checkThat1Return1() {
        int result = Calculator.add("1");
        assertThat(result).isEqualTo(1);
        
    }

    @Test
    @DisplayName("Given 1 and 2 and then return 3")
    void given1And2AndThenReturn3() {
        int result = Calculator.add ("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("Handle unknown amount of numbers and return the sum")
    void handleUnknownAmountOfNumbersAndReturnTheSum() {
        int result = Calculator.add("1,2,3,4");
        assertThat(result).isEqualTo(10);

    }

    @Test
    @DisplayName("Return Sum of Multiple Numbers With new Line")
    void returnSumOfMultipleNumbersWithNewLine() {
        int result = Calculator.add("1\n2,3");
        assertThat(result).isEqualTo(6);
        
    }

}
