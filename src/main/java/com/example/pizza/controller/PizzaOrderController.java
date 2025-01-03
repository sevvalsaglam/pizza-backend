package com.example.pizza.controller;

import com.example.pizza.model.PizzaOrder;
import com.example.pizza.service.PizzaOrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "http://localhost:5174")  // Frontend'inizin çalıştığı port

public class PizzaOrderController {
    private final PizzaOrderService orderService;

    public PizzaOrderController(PizzaOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<PizzaOrder> createOrder(@RequestBody PizzaOrder order) {
        PizzaOrder savedOrder = orderService.saveOrder(order);
        return ResponseEntity.ok(savedOrder);
    }
}