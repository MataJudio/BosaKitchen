package com.BosaKitchen.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "restaurant_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDetailModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String address;

    @Column(nullable = false, length = 15)
    private String phoneNumber;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(length = 100)
    private String openingHours;

    @Column(nullable = false, updatable = false)
    private String createdAt = java.time.LocalDateTime.now().toString();
}
