package com.myhotel.company.infraestructure.rest;

import com.myhotel.company.domain.usecase.EmployeeService;
import com.myhotel.company.infraestructure.handler.ResponseEntityBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/employees")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping("/a")
    public ResponseEntity<?> getCountSegmentoA() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountSegmentoA()).build();
    }

    @GetMapping("/b")
    public ResponseEntity<?> getCountSegmentoB() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountSegmentoB()).build();
    }

    @GetMapping("/c")
    public ResponseEntity<?> getCountSegmentoC() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountSegmentoC()).build();
    }

    @GetMapping("/max-salary-department")
    public ResponseEntity<?> getMaxSalaryByDepartment() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getMaxSalaryByDepartment()).build();
    }

    @GetMapping("/manager-fifteen-service")
    public ResponseEntity<?> getManagerFifteenYears() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getManagerFifteenYears()).build();
    }
}
