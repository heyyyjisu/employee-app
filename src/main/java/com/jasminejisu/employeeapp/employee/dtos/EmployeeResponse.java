package com.jasminejisu.employeeapp.employee.dtos;

import java.time.LocalDate;

import com.jasminejisu.employeeapp.employee.entities.ContractType;
import com.jasminejisu.employeeapp.employee.entities.Employee;
import com.jasminejisu.employeeapp.employee.entities.Title;

public record EmployeeResponse(Long id, Title title, ContractType contractType, LocalDate startDate) {
  
  public static EmployeeResponse from (Employee employee) {
    return new EmployeeResponse((employee.getId()), employee.getTitle(), employee.getContractType(), employee.getStartDate());
  }
}
