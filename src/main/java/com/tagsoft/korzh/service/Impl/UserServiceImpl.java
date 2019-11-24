package com.tagsoft.korzh.service.Impl;

import com.tagsoft.korzh.model.UserEntity;
import com.tagsoft.korzh.repository.UserRepository;
import com.tagsoft.korzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public boolean createUser(UserEntity userEntity) {
        try {
            userRepository.save(userEntity);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
