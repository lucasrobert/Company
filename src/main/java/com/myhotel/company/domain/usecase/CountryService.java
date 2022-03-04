package com.myhotel.company.domain.usecase;

import com.myhotel.company.domain.usecase.dto.CountrySummary;

import java.util.List;

public interface CountryService {
    List<CountrySummary> getCountrySummary();
}

