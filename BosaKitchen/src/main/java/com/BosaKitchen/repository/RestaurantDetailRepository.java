package com.BosaKitchen.repository;

import com.BosaKitchen.models.RestaurantDetailModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantDetailRepository extends JpaRepository<RestaurantDetailModels, Long> {
}
