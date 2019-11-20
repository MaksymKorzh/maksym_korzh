package com.tagsoft.korzh.service.Impl;

import com.tagsoft.korzh.model.UserModel;
import com.tagsoft.korzh.repository.UserRepository;
import com.tagsoft.korzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(UserModel userModel) {
        userRepository.save(userModel);
    }

    @Override
    public UserModel findUserByMail(String mail) {
        return userRepository.findByMail(mail);
    }

}
