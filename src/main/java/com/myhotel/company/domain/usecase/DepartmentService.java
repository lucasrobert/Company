package com.myhotel.company.domain.usecase;

import com.myhotel.company.domain.usecase.dto.AvgSalaryByDepartment;
import com.myhotel.company.domain.usecase.dto.SegmentoByDepartment;

import java.util.List;

public interface DepartmentService {
    List<SegmentoByDepartment> getCountSegmentoA();

    List<SegmentoByDepartment> getCountSegmentoB();

    List<SegmentoByDepartment> getCountSegmentoC();

    List<AvgSalaryByDepartment> getAvgSAlary();
}

