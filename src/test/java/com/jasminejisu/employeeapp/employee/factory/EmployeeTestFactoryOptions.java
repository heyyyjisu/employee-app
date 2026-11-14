package com.jasminejisu.employeeapp.employee.factory;

import java.time.LocalDate;

import com.jasminejisu.employeeapp.employee.entities.ContractType;
import com.jasminejisu.employeeapp.employee.entities.Title;

public class EmployeeTestFactoryOptions {

  Long id;
  Title title;
  String firstName;
  String middleName;
  String lastName;
  String email;
  String mobile;
  String address;
  ContractType contractType;
  LocalDate startDate;
  LocalDate endDate;
  String supervisor;

  private EmployeeTestFactoryOptions(Builder builder) {
    this.id = builder.id;
    this.title = builder.title;
    this.firstName = builder.firstName;
    this.middleName = builder.middleName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.mobile = builder.mobile;
    this.address = builder.address;
    this.contractType = builder.contractType;
    this.startDate = builder.startDate;
    this.endDate = builder.endDate;
    this.supervisor = builder.supervisor;
  }

  public static Builder builder() {
    return new Builder();
  }

  protected static final class Builder {
    private Long id;
    private Title title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobile;
    private String address;
    private ContractType contractType;
    private LocalDate startDate;
    private LocalDate endDate;
    private String supervisor;

    public Builder id (Long id) {
      this.id = id;
      return id;
    }

    public Builder title(Title title) {
      this.title = title;
      return title;
    }

    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return firstName;
    }

    public Builder middleName (String middleName) {
      this.middleName = middleName;
      return middleName;
    }

    public Builder lastName (String lastName) {
      this.lastName = lastName;
      return lastName;
    }

    public Builder email (String email) {
      this.email = email;
      return email;
    }

    public Builder mobile (String mobile) {
      this.mobile = mobile;
      return mobile;
    }

    public Builder address (String address) {
      this.address = address;
      return address;
    }

    public Builder contractType (ContractType contractType) {
      this.contractType = contractType;
      return contractType;
    }

    public Builder startDate (LocalDate starDate) {
      this.startDate = starDate;
      return starDate;
    }

    public Builder endDate (LocalDate endDate) {
      this.endDate = endDate;
      return endDate;
    }

    public Builder supervisor (String supervisor) {
      this.supervisor = supervisor;
      return supervisor;
    }

    public EmployeeTestFactoryOptions build() {
      return new EmployeeTestFactoryOptions(this);
    }
    
  }
}
