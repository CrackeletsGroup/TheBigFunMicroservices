package com.example.profile.service;

import com.example.profile.api.internal.ProfileContextFacade;
import com.example.profile.domain.model.Organizer;
import com.example.profile.domain.service.OrganizerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileContextFacadeImpl implements ProfileContextFacade {

    private final OrganizerService organizerService;

    public ProfileContextFacadeImpl(OrganizerService organizerService) {
        this.organizerService = organizerService;
    }

    @Override
    public List<Organizer> getAllOrganizers() {
        return organizerService.getAll();
    }
}
