package com.orderservice.service;

import com.orderservice.entity.Order;
import com.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class OrderService
{
    private final OrderRepository orderRepository;

    public Order saveOrder(Order order)
    {
        return orderRepository.save(order);
    }
}
