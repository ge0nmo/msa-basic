package com.payment.service;

import com.payment.entity.Payment;
import com.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }

    public String paymentProcessing()
    {
        return new Random().nextBoolean()?"success":"false";
    }
}
