package com.orderservice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

@Getter @Setter
public class Payment
{
    private Long paymentId;

    private String paymentStatus;

    private String transactionId;

    private Long orderId;

    private int quantity;
}
