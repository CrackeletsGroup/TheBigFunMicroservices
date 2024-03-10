package com.example.profile.resource;

import com.example.profile.domain.model.AttendeeEvent;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AttendeeResource {

    private Long id;
    private String userName;
    private String name;
    private String email;
    private Set<AttendeeEvent> eventsListByAttendee;
}
