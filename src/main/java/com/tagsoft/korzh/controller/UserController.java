package com.tagsoft.korzh.controller;

import com.tagsoft.korzh.model.UserModel;
import com.tagsoft.korzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/users")
    public void createUser(@RequestBody UserModel userModel) {
        userService.createUser(userModel);
    }

    @GetMapping(value = "/users")
    public void getUser(@RequestBody String mail) {
        userService.findUserByMail(mail);
    }
}
