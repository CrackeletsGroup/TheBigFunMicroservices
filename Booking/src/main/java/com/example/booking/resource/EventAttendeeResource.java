package com.example.booking.resource;

import com.example.booking.domain.model.Event;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class EventAttendeeResource {

    private Long attendeeId;
    private Event event;
}
