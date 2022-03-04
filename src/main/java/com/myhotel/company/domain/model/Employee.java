package com.myhotel.company.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder()
@Table(schema = "myhotel", name = "employees")
public class Employee {

    @Id
    @Column(name = "EMPLOYEE_ID")
    private double employeeId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private Date hireDate;

    @OneToOne
    @JoinColumn(name = "JOB_ID", referencedColumnName = "JOB_ID")
    private Job job;

    @Column(name = "SALARY")
    private double salary;

    @Column(name = "COMMISSION_PCT")
    private double commissionPct;

    @Column(name = "MANAGER_ID")
    private double managerId;

    @OneToOne
    @JoinColumn(name = "DEPARTMENT_ID", referencedColumnName = "DEPARTMENT_ID")
    private Department department;

}