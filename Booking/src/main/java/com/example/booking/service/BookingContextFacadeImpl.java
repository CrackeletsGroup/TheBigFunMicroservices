package com.example.booking.service;

import com.example.booking.api.internal.BookingContextFacade;
import com.example.booking.domain.model.Event;
import com.example.booking.domain.service.EventService;

import java.util.List;

public class BookingContextFacadeImpl implements BookingContextFacade {
    private final EventService eventService;

    public BookingContextFacadeImpl(EventService eventService) {
        this.eventService = eventService;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

/*    @Override
    public List<Event> getAllByOrganizerId(Long id) {
        return eventService.getAllByOrganizerId(id);
    }*/
}
