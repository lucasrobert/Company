package com.myhotel.company.domain.usecase.mapper;

import com.myhotel.company.domain.model.Employee;
import com.myhotel.company.domain.usecase.dto.EmployeeDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructMapper {
    MapStructMapper INSTANCE = Mappers.getMapper(MapStructMapper.class);

    EmployeeDto employeeToDto(Employee employee);
}