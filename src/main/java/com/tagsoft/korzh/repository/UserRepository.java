package com.tagsoft.korzh.repository;

import com.tagsoft.korzh.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

    UserModel findByMail(String mail);

}
