package com.example.pizza.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PizzaOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String size;

    private String dough;

    @ElementCollection
    @CollectionTable(name = "order_toppings", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "topping")
    private List<String> toppings;

    private String note;

    private Integer quantity;

    private Double totalPrice;
}