package com.BosaKitchen.repository;

import com.BosaKitchen.models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModels, Long> {
    Optional<UserModels> findByEmail(String email);
}
