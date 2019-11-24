package com.tagsoft.korzh.repository;

import com.tagsoft.korzh.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
}
