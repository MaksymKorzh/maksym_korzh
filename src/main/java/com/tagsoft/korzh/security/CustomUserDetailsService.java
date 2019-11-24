package com.tagsoft.korzh.security;

import com.tagsoft.korzh.model.RoleEntity;
import com.tagsoft.korzh.model.UserEntity;
import com.tagsoft.korzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if (username.trim().isEmpty()) {
            throw new UsernameNotFoundException("username is empty");
        }

        UserEntity user = userService.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User " + username + " not found");
        }

        return new User(user.getMail(), user.getPassword(), getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(UserEntity user) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        RoleEntity role = user.getRole_id();
        authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        return authorities;
    }

}
