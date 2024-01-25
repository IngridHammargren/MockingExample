package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;



class EmployeesTest {

    @Test
    @DisplayName("check Payment to Employees With Stub")
    void checkPaymentToEmployeesWithStub() {
        Employees employees = new Employees(new EmployeeRepositoryStub(), new BankServiceStub());


        int numbersOfPayment = employees.payEmployees();
        assertThat(numbersOfPayment).isEqualTo(2);
    }


    @Test
    @DisplayName("check That Payment For Employees Catch RunTime Exception")
    void checkThatPaymentForEmployeesCatchRunTimeException() {
        BankService bankServiceMock = mock(BankService.class);
        doThrow((RuntimeException.class)).when(bankServiceMock).pay(anyString(),anyDouble());


        EmployeeRepository employeeRepository = new EmployeeRepositoryStub();
        Employees employees = new Employees (employeeRepository, bankServiceMock);

        int numbersOfPayment = employees.payEmployees();

        assertThat(numbersOfPayment).isEqualTo(0);
        assertThat(employeeRepository.findAll()).extracting(Employee::isPaid).containsOnly(false);
        verify(bankServiceMock, times(2)).pay(anyString(),anyDouble());

    }

}
