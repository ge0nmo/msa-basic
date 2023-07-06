package com.example.paymentservice.service;

import com.example.paymentservice.entity.Payment;
import com.example.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class PaymentService
{
    private final PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment)
    {
        payment.setTransactionId(UUID.randomUUID().toString());
        payment.setPaymentStatus(paymentProcessing());
        return paymentRepository.save(payment);
    }

    public String paymentProcessing()
    {
        //api should be 3rd party payment gateway (paypal, paytm ...)
        return new Random().nextBoolean()? "success":"false";
    }
}
