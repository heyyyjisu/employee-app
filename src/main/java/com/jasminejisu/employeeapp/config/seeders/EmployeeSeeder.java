package com.jasminejisu.employeeapp.config.seeders;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.jasminejisu.employeeapp.employee.EmployeeRepository;
import com.jasminejisu.employeeapp.employee.entities.ContractType;
import com.jasminejisu.employeeapp.employee.entities.Employee;
import com.jasminejisu.employeeapp.employee.entities.Title;

@Component 
@Profile ("dev")
public class EmployeeSeeder implements CommandLineRunner {
  private final EmployeeRepository repo;

  public EmployeeSeeder(EmployeeRepository repo) {
    this.repo = repo;
  }

  @Override
  public void run(String... args) throws Exception {
    if(repo.count() > 0) return;

    repo.saveAll(List.of(
      new Employee(Title.MANAGER, "employee1", null, "one", "employee1@example.com", "0412345678", "null", ContractType.CONTRACT, LocalDate.now(), LocalDate.now(), "null"),
      new Employee(Title.DESIGNER, "employee2", null, "two", "employee2@example.com", "0487654321", "null", ContractType.FULL_TIME, LocalDate.now(), LocalDate.now(), "null"),
      new Employee(Title.ENGINEER, "employee3", null, "three", "employee3@example.com", "0421345678", "null", ContractType.PART_TIME, LocalDate.now(), LocalDate.now(), "null")
    ));
  }
}
