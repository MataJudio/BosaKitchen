package com.BosaKitchen.security;

import com.BosaKitchen.models.UserModels;
import com.BosaKitchen.security.JwtUtil;
import com.BosaKitchen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public UserModels registerUser(@RequestBody UserModels user) {
        user.setPasswordHash(passwordEncoder.encode(user.getPasswordHash()));
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> credentials) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(credentials.get("email"), credentials.get("password"))
        );

        UserDetails userDetails = (UserDetails) userService.getUserByEmail(credentials.get("email")).orElseThrow();
        String token = jwtUtil.generateToken(userDetails.getUsername());

        return Map.of("token", token);
    }
}
