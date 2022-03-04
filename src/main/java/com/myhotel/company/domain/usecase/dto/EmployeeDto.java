package com.myhotel.company.domain.usecase.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder()
public class EmployeeDto {

    private double employeeId;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Date hireDate;

    private JobDto job;

    private double salary;

    private double commissionPct;

    private double managerId;

    private DepartmentDto department;

}