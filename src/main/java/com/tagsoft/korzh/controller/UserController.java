package com.tagsoft.korzh.controller;

import com.tagsoft.korzh.model.RoleEntity;
import com.tagsoft.korzh.model.UserEntity;
import com.tagsoft.korzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/users")
    public String createUser(@RequestParam(value = "mail") String mail,
                             @RequestParam(value = "password") String password,
                             @RequestParam(value = "username") String username,
                             @RequestParam(value = "country") String country,
                             @RequestParam(value = "state") String state
                             ) {
        boolean success = userService.createUser(new UserEntity(username, mail, password,
                new RoleEntity(1, "USER"), country, state));
        if (success) {
            return "redirect:/home";
        } else {
            return "registration";
        }
    }
}
