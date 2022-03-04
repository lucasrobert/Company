package com.myhotel.company.domain.repository;

import com.myhotel.company.domain.model.Department;
import com.myhotel.company.domain.usecase.dto.AvgSalaryByDepartment;
import com.myhotel.company.domain.usecase.dto.SegmentoByDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Double> {


    @Query("SELECT d.departmentName  as departmentName, count(*) as count from Employee e " +
            "INNER JOIN Department d on d.departmentId = e.department.departmentId " +
            "WHERE e.salary  < 3500" +
            "GROUP BY d.departmentName")
    List<SegmentoByDepartment> getCountSegmentoA();

    @Query("SELECT d.departmentName as departmentName, count(*) as count from Employee e " +
            "INNER JOIN Department d on d.departmentId = e.department.departmentId " +
            "WHERE e.salary  >= 3500 " +
            "AND e.salary < 8000 " +
            "GROUP BY d.departmentName")
    List<SegmentoByDepartment> getCountSegmentoB();

    @Query("SELECT d.departmentName as departmentName, count(*) AS count from Employee e " +
            "INNER JOIN Department d on d.departmentId = e.department.departmentId " +
            "WHERE e.salary  >= 8000 " +
            "GROUP BY d.departmentName")
    List<SegmentoByDepartment> getCountSegmentoC();

    @Query(value = "SELECT d.DEPARTMENT_NAME as departmentName,  ROUND(AVG(e.SALARY), 2) as salaryAvg" +
            "    FROM employees e" +
            "    INNER JOIN departments d ON d.DEPARTMENT_ID = e.DEPARTMENT_ID" +
            "    GROUP BY d.DEPARTMENT_NAME" +
            "    HAVING COUNT(*) > 10", nativeQuery = true)
    List<AvgSalaryByDepartment> getAvgSAlary();

}
