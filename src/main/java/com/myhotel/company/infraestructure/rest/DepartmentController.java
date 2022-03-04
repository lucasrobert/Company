package com.myhotel.company.infraestructure.rest;

import com.myhotel.company.domain.usecase.DepartmentService;
import com.myhotel.company.infraestructure.handler.ResponseEntityBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/departments")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DepartmentController {

    private final DepartmentService service;

    @GetMapping("/a")
    public ResponseEntity<?> getCountSegmentoAByDepartament() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountSegmentoA()).build();
    }

    @GetMapping("/b")
    public ResponseEntity<?> getCountSegmentoBByDepartament() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountSegmentoB()).build();
    }

    @GetMapping("/c")
    public ResponseEntity<?> getCountSegmentoCByDepartament() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountSegmentoC()).build();
    }

    @GetMapping("/avg-salary")
    public ResponseEntity<?> getAvgSAlary() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getAvgSAlary()).build();
    }
}
