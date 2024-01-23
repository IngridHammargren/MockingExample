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

    @Test
    @DisplayName("Control that setID returns right ID")
    void controlThatSetIdReturnsRightId() {
        employee.setId("221");
        var result =employee.getId();
        assertThat(result).isEqualTo("221");
        
    }

    @Test
    @DisplayName("Control that getSalary returns right salary")
    void controlThatGetSalaryReturnsRightSalary() {
        var result = employee.getSalary();
        assertThat(result).isEqualTo(26000);
        
    }

    @Test
    @DisplayName("Control that setSalary returns right salary")
    void controlThatSetSalaryReturnsRightSalary() {
        employee.setSalary(35000);
        var result = employee.getSalary();
        assertThat(result).isEqualTo(35000);
    }


        


    



        

}

