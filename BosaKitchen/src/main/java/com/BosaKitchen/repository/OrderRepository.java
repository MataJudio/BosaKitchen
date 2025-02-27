package com.BosaKitchen.repository;

import com.BosaKitchen.models.OrderModels;
import com.BosaKitchen.models.UserModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderModels, Long> {
    List<OrderModels> findByUser(UserModels user);
}
