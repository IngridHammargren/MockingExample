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
    @DisplayName("test Getters with default values from constructor")
    void testGettersWithDefaultValuesFromConstructor() {
        var idResult = employee.getId();
        var salaryResult = employee.getSalary();
        var isPaidResult = employee.isPaid();

        assertThat(idResult).isEqualTo("123");
        assertThat(salaryResult).isEqualTo(26000);
        assertThat(isPaidResult).isFalse();

    }



    @Test
    @DisplayName("Control that setID returns right ID")
    void controlThatSetIdReturnsRightId() {
        employee.setId("221");
        var result =employee.getId();
        assertThat(result).isEqualTo("221");
        
    }


    @Test
    @DisplayName("Control that setSalary returns right salary")
    void controlThatSetSalaryReturnsRightSalary() {
        employee.setSalary(35000);
        var result = employee.getSalary();
        assertThat(result).isEqualTo(35000);
    }

    @Test
    @DisplayName("check if the employee got paid")
    void checkIfTheEmployeeGotPaid() {
        employee.setPaid(true);
        var result = employee.isPaid();
        assertThat(result).isTrue();

    }


    @Test
    @DisplayName("get information about the employee")
    void getInformationAboutTheEmployee() {
        var result = employee.toString();
        assertThat(result).isEqualTo("Employee [id=123, salary=26000.0]");
    }
        

}

