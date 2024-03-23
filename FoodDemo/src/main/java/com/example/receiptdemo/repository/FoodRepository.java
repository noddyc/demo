package com.example.receiptdemo.repository;

import com.example.receiptdemo.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodRepository extends CrudRepository<Food, Long>{
    Optional<Food> findByFoodId(int foodId);
}
