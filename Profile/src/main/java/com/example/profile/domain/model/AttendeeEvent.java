package com.example.profile.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.With;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@With
@Entity
@Table(name="attendee_events")
public class AttendeeEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "event_id",nullable = false)
    @JsonIgnore
    private Attendee attendee;
    private Long attendeeId;


    public AttendeeEvent(Attendee attendee, Long attendeeId) {
        this.attendee = attendee;
        this.attendeeId = attendeeId;
    }
}
