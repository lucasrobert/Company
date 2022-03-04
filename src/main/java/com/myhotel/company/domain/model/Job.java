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
@Table(schema = "myhotel", name = "jobs")
public class Job {

    @Id
    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "MIN_SALARY")
    private double minSalary;

    @Column(name = "MAX_SALARY")
    private double maxSalary;

}