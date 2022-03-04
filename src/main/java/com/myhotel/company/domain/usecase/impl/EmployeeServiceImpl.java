package com.myhotel.company.domain.usecase.impl;

import com.myhotel.company.domain.repository.EmployeeRepository;
import com.myhotel.company.domain.usecase.EmployeeService;
import com.myhotel.company.domain.usecase.dto.EmployeeDto;
import com.myhotel.company.domain.usecase.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;
    private final MapStructMapper mapper;

    @Override
    public Integer getCountSegmentoA() {
        return repository.getCountSegmentoA();
    }

    @Override
    public Integer getCountSegmentoB() {
        return repository.getCountSegmentoB();
    }

    @Override
    public Integer getCountSegmentoC() {
        return repository.getCountSegmentoC();
    }

    @Override
    public List<EmployeeDto> getMaxSalaryByDepartment() {
        return repository.getMaxSalaryByDepartment().stream()
                .map(mapper::employeeToDto)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public List<EmployeeDto> getManagerFifteenYears() {
        return repository.getManagerFifteenYears().stream()
                .map(mapper::employeeToDto)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
