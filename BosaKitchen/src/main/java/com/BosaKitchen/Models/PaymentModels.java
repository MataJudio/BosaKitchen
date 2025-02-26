package com.bosakitchen.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderModels order;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod paymentMethod;

    @Column(nullable = false)
    private Double amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus paymentStatus = PaymentStatus.PENDING;

    private String transactionId;

    @Column(nullable = false, updatable = false)
    private String createdAt = java.time.LocalDateTime.now().toString();

    public enum PaymentMethod {
        CREDIT_CARD, PAYPAL, MPESA, AIRTEL_MONEY
    }

    public enum PaymentStatus {
        PENDING, COMPLETED, FAILED
    }
}
