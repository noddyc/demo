package com.example.receiptdemo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="food_id")
    long foodId;

    @Column(name = "gtin")
    String gtin;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    double price;
}
