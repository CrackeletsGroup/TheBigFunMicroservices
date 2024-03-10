package com.example.profile.domain.service;

import com.example.profile.domain.model.OrganizerEvent;

import java.util.List;

public interface OrganizerEventService {

    List<OrganizerEvent> getAll();
    List<OrganizerEvent> getAllByOrganizerId(Long organizerId);
}
