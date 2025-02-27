package com.BosaKitchen.service;

import com.BosaKitchen.models.MenuItemModels;
import com.BosaKitchen.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository MenuItemRepository;

    public List<MenuItemModels> getAllMenuItems() {
        return MenuItemRepository.findAll();
    }

    public List<MenuItemModels> getAvailableMenuItems() {
        return MenuItemRepository.findByIsAvailableTrue();
    }

    public Optional<MenuItemModels> getMenuItemById(Long id) {
        return MenuItemRepository.findById(id);
    }

    public MenuItemModels saveMenuItem(MenuItemModels menuItem) {
        return MenuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        MenuItemRepository.deleteById(id);
    }
}
