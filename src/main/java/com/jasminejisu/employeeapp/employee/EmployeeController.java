package com.jasminejisu.employeeapp.employee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasminejisu.employeeapp.employee.dtos.EmployeeResponse;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController 
@RequestMapping ("/employees")
public class EmployeeController {
  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @GetMapping()
  public ResponseEntity<List<EmployeeResponse>> findAll() {
    List<EmployeeResponse> employees = employeeService.findAll().stream().map(employee -> EmployeeResponse.from(employee)).toList();
    return ResponseEntity.ok(employees);
  }
 
  

  
}
