package com.BosaKitchen.service;

import com.BosaKitchen.models.OrderModels;
import com.BosaKitchen.models.UserModels;
import com.BosaKitchen.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderModels> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<OrderModels> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public List<OrderModels> getOrdersByUser(UserModels user) {
        return orderRepository.findByUser(user);
    }

    public OrderModels saveOrder(OrderModels order) {
        return orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
