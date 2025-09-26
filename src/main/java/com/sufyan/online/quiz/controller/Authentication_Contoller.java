package com.sufyan.online.quiz.controller;

import com.sufyan.online.quiz.security.dataloder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication_Contoller {
    @Autowired
    private dataloder loder;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Userdetails user){
String username=user.getUsername();
String password=user.getPassword();
String role=user.getRole();
loder.registerUser(username,password,role);
return ResponseEntity.ok("User registered successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Userdetails user){
        String username=user.getUsername();
        String password=user.getPassword();

    }
}
