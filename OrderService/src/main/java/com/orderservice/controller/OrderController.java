package com.orderservice.controller;

import com.orderservice.entity.Order;
import com.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RequiredArgsConstructor
@RestController
public class OrderController
{
    private final OrderService orderService;

    @PostMapping("/save")
    public Order bookOrder(@RequestBody Order order)
    {
        return orderService.saveOrder(order);
    }
}
