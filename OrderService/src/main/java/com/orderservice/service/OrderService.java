package com.orderservice.service;

import com.orderservice.dto.Payment;
import com.orderservice.dto.TransactionRequest;
import com.orderservice.dto.TransactionResponse;
import com.orderservice.entity.Order;
import com.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class OrderService
{
    private final OrderRepository orderRepository;

    private final RestTemplate restTemplate;

    public TransactionResponse saveOrder(TransactionRequest request)
    {
        Order order = request.getOrder();
        Payment payment = request.getPayment();
        payment.setOrderId(order.getId());
        payment.setQuantity(order.getQuantity());

        //rest call
        Payment paymentResponse = restTemplate.postForObject("http://localhost:9090/payment/pay", payment, Payment.class);

        String response = paymentResponse.getPaymentStatus().equals("success") ? "payment processing successful and order placed" : "there is a failure in payment api, order in cart";

        orderRepository.save(order);

        return new TransactionResponse(order, paymentResponse.getQuantity(), paymentResponse.getTransactionId(), response);
    }
}
