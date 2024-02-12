package com.example;

import java.util.List;

public class EmployeeRepositoryStud implements EmployeeRepository {


    @Override
    public List<Employee> findAll() {
        return List.of(new Employee("Donald duck",100.000),new Employee("Kalle anka",90.000));
    }

    @Override
    public Employee save(Employee e) {
        return null;
    }
}
