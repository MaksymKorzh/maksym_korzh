package com.tagsoft.korzh.service;

import com.tagsoft.korzh.model.UserEntity;

public interface UserService {

    UserEntity findByUsername(String username);

    boolean createUser(UserEntity userEntity);

}
