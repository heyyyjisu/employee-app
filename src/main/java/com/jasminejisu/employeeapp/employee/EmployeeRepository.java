package com.jasminejisu.employeeapp.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jasminejisu.employeeapp.employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
  
}
