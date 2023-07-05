package com.payment.controller;

import com.payment.entity.Payment;
import com.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/payment")
@RestController
public class PaymentController
{
    private final PaymentService paymentService;

    @PostMapping("/do")
    public Payment doPayment(@RequestBody Payment payment)
    {
        return paymentService.doPayment(payment);
    }
}
