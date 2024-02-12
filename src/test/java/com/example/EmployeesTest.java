package com.example;

import net.bytebuddy.implementation.bytecode.Throw;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class EmployeesTest {

BankService bankService = Mockito.spy(BankServiceStud.class);
EmployeeRepository employeeRepository = new EmployeeRepositoryStud();
Employees employees = new Employees(employeeRepository, bankService);
    @Test
    @DisplayName("Double check if my mock employeeRepository findALL method really works and return 2 employees")
    void doubleCheckIfMyMockEmployeeRepositoryFindAllMethodReallyWorksAndReturn2Employees() {

        assertThat(employees.payEmployees()).isEqualTo(2);
    }
    @Test
    @DisplayName("Send something that will trigger the catch RuntimeException and then return 0")
    void sendSomethingThatWillTriggerTheCatchRuntimeExceptionAndThenReturn0() {

        BankService bankService1 = Mockito.spy(BankServiceRuntimeExecution.class);
        Employees employeesCrash = new Employees(employeeRepository, bankService1);
        assertThat(employeesCrash.payEmployees()).isEqualTo(0);
    }




}