package com.jasminejisu.employeeapp.employee.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

// employee-id, first name, middle name, last name, email, mobile, residential address, title, contract-type, start-date, finish-date or on-going, supervisor

@Entity 
@Table(name = "employees")
public class Employee {

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotBlank (message = "Title is required")
  @Enumerated (EnumType.STRING)
  private Title title;

  @NotBlank (message = "First name is required")
  @Size (min = 2, max = 100, message = "First name must be between 2 and 100 characters")
  @Column (name = "first_name")
  private String firstName;

  @Column(nullable = true, name = "middle_name")
  private String middleName;

  @NotBlank (message = "Last name is required")
  @Size (min = 2, max = 100, message = "Last name must be between 2 and 100 characters")
  @Column (name="last_name")
  private String lastName;

  @NotBlank (message = "Email is required")
  @Email (message = "Please provide a valid email address")
  @Column(unique = true)
  private String email;

  @NotBlank (message = "Mobile number is required")
  @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Please provide a valid mobile number")
  @Column (unique = true)
  private String mobile;

  @NotBlank (message = "Residential address is required")
  private String address;

  @NotNull (message = "Contract type is required")
  @Enumerated (EnumType.STRING)
  @Column (name = "contract_type")
  private ContractType contractType;

  @NotNull (message = "Start date is required")
  @PastOrPresent (message = "Start date cannot be in the future")
  private LocalDate startDate;

  @FutureOrPresent (message = "End date cannot be in the past")
  @Column(nullable = true)
  private LocalDate endDate;

  @NotBlank (message = "Supervisor name is required")
  private String supervisor;


  
  public Employee() {
  }


  public Employee(Title title,
      @NotBlank(message = "First name is required") @Size(min = 2, max = 100, message = "First name must be between 2 and 100 characters") String firstName,
      String middleName,
      @NotBlank(message = "Last name is required") @Size(min = 2, max = 100, message = "Last name must be between 2 and 100 characters") String lastName,
      @NotBlank(message = "Email is required") @Email(message = "Please provide a valid email address") String email,
      @NotBlank(message = "Mobile number is required") @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Please provide a valid mobile number") String mobile,
      @NotBlank(message = "Residential address is required") String address, ContractType contractType,
      @NotNull(message = "Start date is required") @PastOrPresent(message = "Start date cannot be in the future") LocalDate startDate,
      @FutureOrPresent(message = "End date cannot be in the past") LocalDate endDate,
      @NotBlank(message = "Supervisor name is required") String supervisor) {
    this.title = title;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.email = email;
    this.mobile = mobile;
    this.address = address;
    this.contractType = contractType;
    this.startDate = startDate;
    this.endDate = endDate;
    this.supervisor = supervisor;
  }

  public boolean isOngoing() {
    return endDate == null;
  }



  public Long getId() {
    return id;
  }

  public Title getTitle() {
    return title;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getMobile() {
    return mobile;
  }

  public String getAddress() {
    return address;
  }

  public ContractType getContractType() {
    return contractType;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public String getSupervisor() {
    return supervisor;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(Title title) {
    this.title = title;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setContractType(ContractType contractType) {
    this.contractType = contractType;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  public void setSupervisor(String supervisor) {
    this.supervisor = supervisor;
  }

}
