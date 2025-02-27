package com.BosaKitchen.service;

import com.BosaKitchen.models.RestaurantDetailModels;
import com.BosaKitchen.repository.RestaurantDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantDetailService {

    @Autowired
    private RestaurantDetailRepository restaurantDetailRepository;

    public List<RestaurantDetailModels> getAllRestaurantDetails() {
        return restaurantDetailRepository.findAll();
    }

    public Optional<RestaurantDetailModels> getRestaurantDetailById(Long id) {
        return restaurantDetailRepository.findById(id);
    }

    public RestaurantDetailModels saveRestaurantDetail(RestaurantDetailModels restaurantDetail) {
        return restaurantDetailRepository.save(restaurantDetail);
    }

    public void deleteRestaurantDetail(Long id) {
        restaurantDetailRepository.deleteById(id);
    }
}
