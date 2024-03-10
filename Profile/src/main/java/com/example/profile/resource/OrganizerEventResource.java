package com.example.profile.resource;

import com.example.profile.domain.model.Organizer;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class OrganizerEventResource {

    private Long eventId;
    private Organizer organizer;
}
