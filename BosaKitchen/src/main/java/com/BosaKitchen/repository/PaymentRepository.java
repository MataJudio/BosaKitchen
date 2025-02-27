package com.BosaKitchen.repository;

import com.BosaKitchen.models.PaymentModels;
import com.BosaKitchen.models.OrderModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentModels, Long> {
    Optional<PaymentModels> findByOrder(OrderModels order);
}
