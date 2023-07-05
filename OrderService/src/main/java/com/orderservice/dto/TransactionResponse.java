package com.orderservice.dto;

import com.orderservice.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse
{
    private Order order;

    private int quantity;

    private String transactionId;

    private String message;
}
