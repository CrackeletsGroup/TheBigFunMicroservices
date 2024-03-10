package com.example.booking.domain.service;

import com.example.booking.domain.model.EventPayment;

import java.util.List;

public interface EventPaymentService {

    List<EventPayment> getAll();

    List<EventPayment> getAllPaymentByEventId(Long eventId);

}