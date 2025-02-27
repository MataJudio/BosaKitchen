package com.BosaKitchen.repository;

import com.BosaKitchen.models.DeliveryModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryModels, Long> {
}
