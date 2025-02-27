package com.BosaKitchen.controllers;

import com.BosaKitchen.models.RestaurantDetailModels;
import com.BosaKitchen.service.RestaurantDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantDetailController {

    @Autowired
    private RestaurantDetailService restaurantDetailService;

    @GetMapping
    public List<RestaurantDetailModels> getAllRestaurantDetails() {
        return restaurantDetailService.getAllRestaurantDetails();
    }

    @PostMapping
    public RestaurantDetailModels createRestaurantDetail(@RequestBody RestaurantDetailModels restaurantDetail) {
        return restaurantDetailService.saveRestaurantDetail(restaurantDetail);
    }
}
