package com.myhotel.company.infraestructure.rest;

import com.myhotel.company.domain.usecase.CountryService;
import com.myhotel.company.infraestructure.handler.ResponseEntityBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/countries")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {

    private final CountryService service;

    @GetMapping("/summary")
    public ResponseEntity<?> getCountrySummary() {
        return new ResponseEntityBuilder(HttpStatus.OK).data(service.getCountrySummary()).build();
    }
}
