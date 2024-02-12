package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


class EmployeesTest {

BankService bankService = Mockito.spy(BankServiceStud.class);
EmployeeRepository employeeRepository = new EmployeeRepositoryStud();
Employees employees = new Employees(employeeRepository, bankService);

    @Test
    @DisplayName("Double check if my mock employeeRepository findALL method really works and return 2 employees")
    void doubleCheckIfMyMockEmployeeRepositoryFindAllMethodReallyWorksAndReturn2Employees() {

        assertThat(employees.payEmployees()).isEqualTo(2);
        // Cover row 10-12
    }




}