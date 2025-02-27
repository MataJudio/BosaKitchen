package com.BosaKitchen.controllers;  // Correct package

import com.BosaKitchen.models.DeliveryModels;
import com.BosaKitchen.services.DeliveryService; // Ensure this is correct
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping
    public List<DeliveryModels> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliveryModels> getDeliveryById(@PathVariable Long id) {
        return deliveryService.getDeliveryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public DeliveryModels createDelivery(@RequestBody DeliveryModels delivery) {
        return deliveryService.saveDelivery(delivery);
    }
}
