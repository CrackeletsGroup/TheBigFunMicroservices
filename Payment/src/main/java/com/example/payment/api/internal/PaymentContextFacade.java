package com.example.payment.api.internal;

import com.example.payment.domain.model.Payment;

import java.util.List;

public interface PaymentContextFacade {
    List<Payment> getAllPayments();

}
