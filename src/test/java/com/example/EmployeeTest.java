package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
class EmployeeTest {

    private Employee employee;

    @BeforeEach
    void init() { employee = new Employee("123", 26000); }

    @Test
    @DisplayName("Control that getID returns right ID ")
    void controlThatGetIdReturnsRightId() {
        var result = employee.getId();
        assertThat(result).isEqualTo("123");
    }


        


    



        

}

