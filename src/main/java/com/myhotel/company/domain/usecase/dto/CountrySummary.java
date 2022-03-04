package com.myhotel.company.domain.usecase.dto;

public interface CountrySummary {
    String getCountryName();

    Integer getCount();

    double getSalaryAvg();

    double getSalaryMax();

    double getSalaryMin();

    double getAvgYear();
}
