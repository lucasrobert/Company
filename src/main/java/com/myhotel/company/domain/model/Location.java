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
@Table(schema = "myhotel", name = "locations")
public class Location {

    @Id
    @Column(name = "LOCATION_ID")
    private double locationId;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE_PROVINCE")
    private String stateProvince;

    @OneToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "COUNTRY_ID")
    private Country country;

}