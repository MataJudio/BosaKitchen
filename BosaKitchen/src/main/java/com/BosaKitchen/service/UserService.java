package com.BosaKitchen.service;

import com.BosaKitchen.models.UserModels;
import com.BosaKitchen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserModels> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserModels> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public Optional<UserModels> getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserModels saveUser(UserModels user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
