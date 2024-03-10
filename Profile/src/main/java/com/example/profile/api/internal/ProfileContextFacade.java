package com.example.profile.api.internal;

import com.example.profile.domain.model.Organizer;

import java.util.List;

public interface ProfileContextFacade {

    List<Organizer> getAllOrganizers();
}
