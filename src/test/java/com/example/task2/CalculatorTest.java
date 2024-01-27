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


}
