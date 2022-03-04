package com.myhotel.company.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder()
@Table(schema = "myhotel", name = "departments")
public class Department {

    @Id
    @Column(name = "DEPARTMENT_ID")
    private double departmentId;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @Column(name = "MANAGER_ID")
    private double managerId;

    @Column(name = "LOCATION_ID")
    private double location;

}