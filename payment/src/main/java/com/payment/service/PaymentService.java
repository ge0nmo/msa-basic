package com.payment.service;

import com.payment.entity.Payment;
import com.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Transactional
@Slf4j
@RequiredArgsConstructor
@Service
public class PaymentService
{
    private final PaymentRepository paymentRepository;

    public Payment doPayment(Payment payment)
    {
        payment.setTransactionId(UUID.randomUUID().toString());
        return paymentRepository.save(payment);
    }
}
