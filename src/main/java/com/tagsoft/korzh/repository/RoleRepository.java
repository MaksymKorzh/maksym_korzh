package com.tagsoft.korzh.repository;

import com.tagsoft.korzh.model.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Integer> {
}