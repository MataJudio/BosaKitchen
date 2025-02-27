package com.BosaKitchen.controllers;

import com.BosaKitchen.models.MenuItemModels;
import com.BosaKitchen.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuItemController {

    @Autowired
    private MenuItemService MenuItemService;

    @GetMapping
    public List<MenuItemModels> getAllMenuItems() {
        return MenuItemService.getAllMenuItems();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItemModels> getMenuItemById(@PathVariable Long id) {
        return MenuItemService.getMenuItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public MenuItemModels createMenuItem(@RequestBody MenuItemModels menuItem) {
        return MenuItemService.saveMenuItem(menuItem);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable Long id) {
        MenuItemService.deleteMenuItem(id);
        return ResponseEntity.noContent().build();
    }
}
