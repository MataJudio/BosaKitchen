package com.bosakitchen.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "delivery")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveryId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderModels order;

    @Column(nullable = false)
    private String deliveryAddress;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DeliveryStatus deliveryStatus = DeliveryStatus.PENDING;

    private String estimatedTime;
    private String actualTime;

    @Column(nullable = false, updatable = false)
    private String createdAt = java.time.LocalDateTime.now().toString();

    public enum DeliveryStatus {
        PENDING, OUT_FOR_DELIVERY, DELIVERED
    }
}
