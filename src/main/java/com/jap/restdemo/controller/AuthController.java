package com.jap.restdemo.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jap.restdemo.service.JwtUtil;
import com.jap.restdemo.model.UserCredentials;

@RestController
public class AuthController {

    private JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody UserCredentials userCredentials) {
        if ("user".equals(userCredentials.getUsername()) && "password".equals(userCredentials.getPassword())) {
            return jwtUtil.generateToken(userCredentials.getUsername());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}

