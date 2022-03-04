package com.myhotel.company.domain.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder()
@Table(schema = "myhotel", name = "regions")
public class Region {

    @Id
    @Column(name = "REGION_ID")
    private double regionId;

    @Column(name = "REGION_NAME")
    private String regionName;

}