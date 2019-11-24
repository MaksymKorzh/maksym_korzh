package com.tagsoft.korzh.repository;

import com.tagsoft.korzh.model.StateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends CrudRepository<StateEntity, Integer> {

    List<StateEntity> findAllByCountryId(int countryId);
}
