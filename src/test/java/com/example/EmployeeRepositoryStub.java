package com.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryStub implements EmployeeRepository {



    @Override
    public List<Employee> findAll() {
        return List.of(new Employee("1", 40000));
    }

    @Override
    public Employee save(Employee e) {
        return null;

    }

}
