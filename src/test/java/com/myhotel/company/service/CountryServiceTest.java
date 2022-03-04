package com.myhotel.company.service;

import com.myhotel.company.domain.repository.CountryRepository;
import com.myhotel.company.domain.usecase.dto.CountrySummary;
import com.myhotel.company.domain.usecase.impl.CountryServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.doReturn;

@Slf4j
@SpringBootTest
public class CountryServiceTest {

    @Mock
    private CountryRepository repository;

    @InjectMocks
    private CountryServiceImpl service;

    @Test
    @DisplayName("Test getAll completado")
    void testgetAll() {
        CountrySummary summary1 = getCountrySummary("United States of America", 68, 5064.71, 24000.00, 2100.00, 35.0000);
        CountrySummary summary2 = getCountrySummary("United Kingdom", 35, 8885.71, 14000.00, 6100.00, 35.0000);

        doReturn(Arrays.asList(summary1, summary2)).when(repository).getCountrySummary();

        List<CountrySummary> widgets = service.getCountrySummary();

        Assertions.assertEquals(2, widgets.size(), "Debe retornar 2 talleres");
    }

    private CountrySummary getCountrySummary(final String countryName, final Integer count, double salaryAvg, double salaryMax, double salaryMin, double avgYear) {

        return new CountrySummary() {
            @Override
            public String getCountryName() {
                return countryName;
            }

            @Override
            public Integer getCount() {
                return count;
            }

            @Override
            public double getSalaryAvg() {
                return salaryAvg;
            }

            @Override
            public double getSalaryMax() {
                return salaryMax;
            }

            @Override
            public double getSalaryMin() {
                return salaryMin;
            }

            @Override
            public double getAvgYear() {
                return avgYear;
            }
        };
    }
}