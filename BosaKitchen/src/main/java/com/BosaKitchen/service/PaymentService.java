package com.BosaKitchen.service;

import com.BosaKitchen.models.PaymentModels;
import com.BosaKitchen.models.OrderModels;
import com.BosaKitchen.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public List<PaymentModels> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Optional<PaymentModels> getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    public Optional<PaymentModels> getPaymentByOrder(OrderModels order) {
        return paymentRepository.findByOrder(order);
    }

    public PaymentModels savePayment(PaymentModels payment) {
        return paymentRepository.save(payment);
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }
}
