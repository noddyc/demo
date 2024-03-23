package com.example.receiptdemo.service;

import com.example.receiptdemo.model.Food;
import com.example.receiptdemo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;

    public Optional<Food> getFoodById(int foodId){
        return foodRepository.findByFoodId(foodId);
    }

}
