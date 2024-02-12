package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee = new Employee("Donald duck",100000);

    @Test
    @DisplayName("Ensure that toString returns Employee name salary and id")
    void ensureThatToStringReturnsEmployeeNameSalaryAndId() {

        assertThat(employee.toString()).isEqualTo("Employee [id=Donald duck, salary=100000.0]");
    }

    @Test
    @DisplayName("Test setId method in Employee")
    void testSetIdMethodInEmployee() {

       employee.setId("Test");
       assertEquals("Test",employee.getId());

    }

    @Test
    @DisplayName("Test setSalary method in Employee")
    void testSetSalaryMethodInEmployee() {
        employee.setSalary(100);
        assertEquals(100,employee.getSalary());
    }

}