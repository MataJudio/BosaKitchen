package com.BosaKitchen.repository;

import com.BosaKitchen.models.MenuItemModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItemModels, Long> {
    List<MenuItemModels> findByIsAvailableTrue();
}
