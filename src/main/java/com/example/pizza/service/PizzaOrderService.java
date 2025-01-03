package com.example.pizza.service;

import com.example.pizza.model.PizzaOrder;
import com.example.pizza.repository.PizzaOrderRepository;
import org.springframework.stereotype.Service;

@Service
public class PizzaOrderService {
    private final PizzaOrderRepository orderRepository;

    public PizzaOrderService(PizzaOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public PizzaOrder saveOrder(PizzaOrder order) {
        return orderRepository.save(order);
    }
}
