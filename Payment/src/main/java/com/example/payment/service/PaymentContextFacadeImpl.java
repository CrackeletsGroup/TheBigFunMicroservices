package com.example.payment.service;

import com.example.payment.api.internal.PaymentContextFacade;
import com.example.payment.domain.model.Payment;
import com.example.payment.domain.service.PaymentService;

import java.util.List;

public class PaymentContextFacadeImpl implements PaymentContextFacade {

    private final PaymentService paymentService;

    public PaymentContextFacadeImpl(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentService.getAll();
    }
}
