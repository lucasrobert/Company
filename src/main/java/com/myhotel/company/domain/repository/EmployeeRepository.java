package com.myhotel.company.domain.repository;

import com.myhotel.company.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Double> {



    @Query("SELECT COUNT(*) FROM Employee WHERE salary < 3500")
    Integer getCountSegmentoA();

    @Query("SELECT COUNT(*) FROM Employee WHERE salary >= 3500 AND salary < 8000")
    Integer getCountSegmentoB();

    @Query("SELECT COUNT(*) FROM Employee WHERE salary >= 8000")
    Integer getCountSegmentoC();

    @Query("SELECT e1" +
            "    FROM Employee e1" +
            "    LEFT JOIN Employee e2 ON e1.department.departmentId = e2.department.departmentId AND (e1.salary < e2.salary or (e1.salary = e2.salary and e1.employeeId < e2.employeeId))\n" +
            "    INNER JOIN Department d ON d.departmentId = e1.department.departmentId" +
            "    WHERE e2.salary is NULL")
    List<Employee> getMaxSalaryByDepartment();


    @Query(value = "SELECT *" +
            "   FROM employees e" +
            "   INNER JOIN departments d on d.MANAGER_ID = e.EMPLOYEE_ID" +
            "   where" +
            "   e.HIRE_DATE < DATE_ADD(CURRENT_DATE, INTERVAL -15 YEAR)", nativeQuery = true)
    List<Employee> getManagerFifteenYears();



}
