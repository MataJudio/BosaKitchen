package com.BosaKitchen.services;

import com.BosaKitchen.models.DeliveryModels;
import com.BosaKitchen.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public List<DeliveryModels> getAllDeliveries() {
        return deliveryRepository.findAll();
    }

    public Optional<DeliveryModels> getDeliveryById(Long id) {
        return deliveryRepository.findById(id);
    }

    public DeliveryModels saveDelivery(DeliveryModels delivery) {
        return deliveryRepository.save(delivery);
    }
}
