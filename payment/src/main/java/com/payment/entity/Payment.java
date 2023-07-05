package com.payment.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Table(name = "PAYMENT_TB")
@Getter @Setter
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
