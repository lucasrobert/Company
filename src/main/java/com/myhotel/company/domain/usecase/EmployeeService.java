package com.myhotel.company.domain.usecase;


import com.myhotel.company.domain.usecase.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    Integer getCountSegmentoA();

    Integer getCountSegmentoB();

    Integer getCountSegmentoC();

    List<EmployeeDto> getMaxSalaryByDepartment();

    List<EmployeeDto> getManagerFifteenYears();


//    Integer create(AutomovilDto automovil);
//
//    AutomovilDto get(Integer id);
//
//    void update(Integer id, AutomovilDto automovil);
//
//    List<AutomovilDto> getAll(Pageable pageable);
//
//    void delete(Integer id);
}
