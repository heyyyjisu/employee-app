package com.jasminejisu.employeeapp.employee;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jasminejisu.employeeapp.employee.entities.Employee;

@Service 
public class EmployeeService {
  private final EmployeeRepository repo;

  public EmployeeService(EmployeeRepository repo) {
    this.repo = repo;
  }
  
  public List<Employee> findAll() {
    return this.repo.findAll();
  }
  

}
