package com.myhotel.company.domain.repository;

import com.myhotel.company.domain.model.Country;
import com.myhotel.company.domain.usecase.dto.CountrySummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Double> {

@Query(value = "select" +
        "   c.COUNTRY_NAME AS countryName," +
        "   COUNT(*) AS count," +
        "   ROUND(AVG(e.SALARY), 2) AS salaryAvg," +
        "   MAX(e.SALARY) AS salaryMax," +
        "   MIN(e.SALARY) AS salaryMin," +
        "   AVG(YEAR(CURRENT_DATE) - YEAR(e.HIRE_DATE)) AS avgYear"+
        "   FROM employees e"+
        "   INNER JOIN departments d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID" +
        "   INNER JOIN locations l ON l.LOCATION_ID = d.LOCATION_ID" +
        "   INNER JOIN countries c ON c.COUNTRY_ID = l.COUNTRY_ID" +
        "   GROUP BY c.COUNTRY_NAME", nativeQuery = true)
        List<CountrySummary> getCountrySummary();

}
