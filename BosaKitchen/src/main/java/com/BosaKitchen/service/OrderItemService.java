package com.BosaKitchen.service;

import com.BosaKitchen.models.OrderItemModels;
import com.BosaKitchen.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItemModels> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public List<OrderItemModels> getOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findByOrderOrderId(orderId);
    }

    public Optional<OrderItemModels> getOrderItemById(Long id) {
        return orderItemRepository.findById(id);
    }

    public OrderItemModels saveOrderItem(OrderItemModels orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}
