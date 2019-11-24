package com.tagsoft.korzh.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
@Data
public class CountryEntity {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;
}
