package com.example.booking.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name="event_attendees")
public class EventAttendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "event_id",nullable = false)
    @JsonIgnore
    private Event event;
    private Long attendeeId;

    public EventAttendee(Event event, Long attendeeId) {
        this.event = event;
        this.attendeeId = attendeeId;
    }
}