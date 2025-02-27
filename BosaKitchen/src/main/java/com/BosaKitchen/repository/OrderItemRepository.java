package com.BosaKitchen.repository;

import com.BosaKitchen.models.OrderItemModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemModels, Long> {
    List<OrderItemModels> findByOrderOrderId(Long orderId);
}
