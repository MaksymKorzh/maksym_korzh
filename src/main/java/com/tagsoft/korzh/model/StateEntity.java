package com.tagsoft.korzh.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states", schema = "public")
@Data
public class StateEntity {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "country_id")
    private Integer countryId;
}
