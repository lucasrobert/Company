package com.myhotel.company.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder()
@Table(schema = "myhotel", name = "countries")
public class Country {

    @Id
    @Column(name = "COUNTRY_ID")
    private String countryId;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @OneToOne
    @JoinColumn(name = "REGION_ID", referencedColumnName = "REGION_ID")
    private Region region;

}
