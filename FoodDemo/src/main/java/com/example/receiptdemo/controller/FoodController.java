package com.example.receiptdemo.controller;

import com.example.receiptdemo.model.Food;
import com.example.receiptdemo.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FoodController {
    @Autowired
    FoodService foodService;

    @GetMapping("/food/{id}")
    public ResponseEntity<String> getFoodById(@PathVariable("id") String foodId){
        Optional<Food> food = foodService.getFoodById(Integer.parseInt(foodId));
        return food.map(value -> ResponseEntity.ok(value.toString())).orElseGet(() -> ResponseEntity.ok(null));
    }
}
