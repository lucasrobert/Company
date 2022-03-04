package com.myhotel.company.controller;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myhotel.company.domain.repository.CountryRepository;
import com.myhotel.company.domain.usecase.CountryService;
import com.myhotel.company.domain.usecase.dto.CountrySummary;
import com.myhotel.company.infraestructure.handler.ExceptionControllerAdvice;
import com.myhotel.company.infraestructure.rest.CountryController;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Slf4j
@SpringBootTest
class CountryControllerTest {

    @Mock
    private CountryRepository repository;

    @Mock
    private CountryService service;

    private MockMvc mockMvc;

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @InjectMocks
    private CountryController controller;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setControllerAdvice(ExceptionControllerAdvice.class)
                .build();
    }

    @Test
    @DisplayName("GET v1/countries/summary completado")
    void testGetWidgetById() throws Exception {
        CountrySummary summary1 = getCountrySummary("United States of America", 68, 5064.71, 24000.00, 2100.00, 35.0000);
        CountrySummary summary2 = getCountrySummary("United Kingdom", 35, 8885.71, 14000.00, 6100.00, 35.0000);
        ;
        when(service.getCountrySummary()).thenReturn(Arrays.asList(summary1, summary2));

        String expected = "{\"_data\":[{\"count\":68,\"countryName\":\"United States of America\",\"salaryAvg\":5064.71,\"salaryMax\":24000.0,\"avgYear\":35.0,\"salaryMin\":2100.0},{\"count\":35,\"countryName\":\"United Kingdom\",\"salaryAvg\":8885.71,\"salaryMax\":14000.0,\"avgYear\":35.0,\"salaryMin\":6100.0}],\"_errors\":[],\"_status\":\"OK\"}";

        assertTrue(
                matchJson(
                        mockMvc.perform(get("/v1/countries/summary"))
                                .andExpect(status().isOk())
                                .andReturn()
                                .getResponse()
                                .getContentAsString(),
                        expected
                )
        );


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

    public static boolean matchJson(String responseString, String expectedString) {
        try {
            JsonNode response = OBJECT_MAPPER.readTree(responseString);
            JsonNode expected = OBJECT_MAPPER.readTree(expectedString);
            if (ObjectUtils.notEqual(response, expected)) {
                log.error("\u001b[0;31mExpected <" + expectedString + ">\n but was \n<" + responseString + ">.\u001b[0m");
                return false;
            } else {
                return true;
            }
        } catch (IOException var5) {
            return false;
        }
    }

}
