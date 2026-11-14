package com.jasminejisu.employeeapp.employee.factory;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.jasminejisu.employeeapp.employee.EmployeeRepository;
import com.jasminejisu.employeeapp.employee.entities.ContractType;
import com.jasminejisu.employeeapp.employee.entities.Employee;
import com.jasminejisu.employeeapp.employee.entities.Title;

@Component 
@Profile ("test")
public class EmployeeTestFactory {
  private final EmployeeRepository repo;
  private final Faker faker;

  public EmployeeTestFactory(EmployeeRepository repo, Faker faker) {
    this.repo = repo;
    this.faker = faker;
  }

  public Employee build(EmployeeTestFactoryOptions opts) {
    Title title = opts.title != null ? opts.title : faker.options().option(Title.class);

    String firstName = opts.firstName != null ? opts.firstName : faker.name().firstName();
    
    String middleName = opts.middleName != null ? opts.middleName : faker.name().firstName();
    String lastName = opts.lastName != null ? opts.lastName : faker.name().lastName();

    String email = opts.email != null ? opts.email : faker.internet().emailAddress();

    String mobile = opts.mobile != null ? opts.mobile : faker.phoneNumber().phoneNumber();

    String address = opts.address != null ? opts.address : faker.address().fullAddress();

    ContractType contractType = opts.contractType != null ? opts.contractType : faker.options().option(ContractType.class);


    LocalDate startDate = opts.startDate != null ? opts.startDate
      : faker.date().past(30, TimeUnit.DAYS).toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    String supervisor = opts.supervisor != null ? opts.supervisor : faker.name().fullName();

    Employee employee = new Employee(title, firstName, middleName, lastName, email, mobile, address, contractType, startDate, null, supervisor);

    return employee;
      
  }

  public Employee build(){
    // create randomized employee
    var empty = EmployeeTestFactoryOptions.builder().build();
    return build(empty);
  }

  public Employee create(EmployeeTestFactoryOptions opts) {
    var employee = build(opts);
    return this.repo.saveAndFlush(employee);
  }

  public Employee create() {
    // create and save in the db a randomized employee
    var empty = EmployeeTestFactoryOptions.builder().build();
    return create(empty);
  }

  public List<Employee> create(EmployeeTestFactoryOptions opts, int n) {
    ArrayList<Employee> employees = new ArrayList<>();
    for (int i = 0; i < n; i++ ) {
      Employee created = create(opts);
      employees.add(created);
    }
    return employees;
  }

  public List<Employee> create(int n) {
    var empty = EmployeeTestFactoryOptions.builder().build();
    return create(empty, n);
  }


  
 }
