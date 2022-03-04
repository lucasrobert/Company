package com.myhotel.company.domain.usecase.impl;

import com.myhotel.company.domain.repository.CountryRepository;
import com.myhotel.company.domain.usecase.CountryService;
import com.myhotel.company.domain.usecase.dto.CountrySummary;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;


    @Override
    public List<CountrySummary> getCountrySummary() {
        return repository.getCountrySummary();
    }


}
