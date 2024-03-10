package com.example.booking.api.internal;

import com.example.booking.domain.model.Event;

import java.util.List;

public interface BookingContextFacade {

    List<Event> getAllEvents();
    //List<Event> getAllByOrganizerId(Long id);

}
