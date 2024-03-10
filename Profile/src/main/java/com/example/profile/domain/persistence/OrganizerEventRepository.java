package com.example.profile.domain.persistence;

import com.example.profile.domain.model.OrganizerEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizerEventRepository extends JpaRepository<OrganizerEvent,Long> {

    List<OrganizerEvent> findAllByOrganizerId(Long organizerId);
}
