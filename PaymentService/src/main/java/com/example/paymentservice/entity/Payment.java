package com.example.paymentservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "PAYMENT_TB")
@Entity
public class Payment
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentStatus;

    private String transactionId;

    private Long orderId;

    private int quantity;
}
