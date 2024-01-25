package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository {



    @Override
    public List<Employee> findAll() {
        {
            Employee employee1 = new Employee("111", 37000);
            Employee employee2 = new Employee("222", 39000);

            return List.of(employee1, employee2);
        }

    }

    @Override
    public Employee save(Employee e) {
        return null;

    }

}
