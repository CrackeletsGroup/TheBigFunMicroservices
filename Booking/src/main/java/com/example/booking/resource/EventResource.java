package com.example.booking.resource;

import com.example.booking.domain.model.EventAttendee;
import com.example.booking.domain.model.EventPayment;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class EventResource {

    private Long id;
    private String name;
    private String address;
    private int capacity;
    private String image;
    private Date date;
    private int cost;
    private String district;
    private Set<EventAttendee> attendeesListByEvent;
    private Set<EventPayment> payments;






}