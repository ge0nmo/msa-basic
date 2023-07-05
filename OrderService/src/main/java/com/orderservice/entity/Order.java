package com.orderservice.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Table(name = "ORDER_TB")
@Entity
public class Order
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int quantity;

    private double price;
}
