package com.sufyan.online.quiz.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Component;

@Component
public class dataloder {
    @Autowired
    private JdbcUserDetailsManager jdbcUserDetailsManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public void registerUser(String username,String password,String role){
        var user= User.withUsername(username)
                .password(passwordEncoder.encode(password))
                .roles("USER")
                .build();
        jdbcUserDetailsManager.createUser(user);
    }

}
