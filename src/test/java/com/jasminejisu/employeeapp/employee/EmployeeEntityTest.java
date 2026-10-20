package com.jasminejisu.employeeapp.employee;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.jasminejisu.employeeapp.employee.entities.ContractType;
import com.jasminejisu.employeeapp.employee.entities.Employee;
import com.jasminejisu.employeeapp.employee.entities.Title;

public class EmployeeEntityTest {
  private static final LocalDate endDate = null;

  @Test
  @DisplayName ("end date is null")
  void isOngoing_whenEndDateIsNull_isTrue() {
    Employee employee = new Employee(Title.MANAGER, "null", null, "null", "null", "null", "null", ContractType.CONTRACT, LocalDate.now(), endDate, "null");
    assertTrue(employee.isOngoing());
  }

  @Test
  @DisplayName ("end date is not null")
  void isOngoing_whenEndDateIsNotNull_isFalse() {
    Employee employee = new Employee(Title.MANAGER, "null", null, "null", "null", "null", "null", ContractType.CONTRACT, LocalDate.now(), LocalDate.now(), "null");
    assertFalse(employee.isOngoing());
  }

}
