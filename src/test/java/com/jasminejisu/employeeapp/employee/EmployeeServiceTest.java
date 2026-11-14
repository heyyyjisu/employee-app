package com.jasminejisu.employeeapp.employee;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith (MockitoExtension.class)
public class EmployeeServiceTest {
  
  @Mock 
  private EmployeeRepository repo;

  @Spy
  @InjectMocks 
  private EmployeeService employeeService;

  @Test 
  @DisplayName ("findAll calls appropriate repository method")
  void findAll_callRepo() {
    this.employeeService.findAll();
    verify(this.repo).findAll();
  }
}
