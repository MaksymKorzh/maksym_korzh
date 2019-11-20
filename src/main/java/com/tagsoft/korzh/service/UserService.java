package com.tagsoft.korzh.service;

import com.tagsoft.korzh.model.UserModel;

public interface UserService {

    void createUser(UserModel userModel);

    UserModel findUserByMail(String mail);
}
