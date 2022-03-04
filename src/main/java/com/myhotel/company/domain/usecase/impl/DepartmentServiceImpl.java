package com.myhotel.company.domain.usecase.impl;

import com.myhotel.company.domain.repository.DepartmentRepository;
import com.myhotel.company.domain.usecase.DepartmentService;
import com.myhotel.company.domain.usecase.dto.AvgSalaryByDepartment;
import com.myhotel.company.domain.usecase.dto.SegmentoByDepartment;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository repository;


    @Override
    public List<SegmentoByDepartment> getCountSegmentoA() {
        return repository.getCountSegmentoA();
    }

    @Override
    public List<SegmentoByDepartment> getCountSegmentoB() {
        return repository.getCountSegmentoB();
    }

    @Override
    public List<SegmentoByDepartment> getCountSegmentoC() {
        return repository.getCountSegmentoC();
    }

    @Override
    public List<AvgSalaryByDepartment> getAvgSAlary() {
        return repository.getAvgSAlary();
    }
}
