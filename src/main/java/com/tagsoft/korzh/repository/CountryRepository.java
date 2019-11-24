package com.tagsoft.korzh.repository;

import com.tagsoft.korzh.model.CountryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<CountryEntity, Integer> {

    CountryEntity findByName(String name);
}
