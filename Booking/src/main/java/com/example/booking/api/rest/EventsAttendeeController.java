package com.example.booking.api.rest;

import com.example.booking.domain.model.Event;
import com.example.booking.domain.persistence.EventAttendeeRepository;
import com.example.booking.domain.persistence.EventRepository;
import com.example.booking.domain.service.EventAttendeeService;
import com.example.booking.mapping.EventAttendeeMapper;
import com.example.booking.resource.EventAttendeeResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value= "/api/v1/eventsto")
public class EventsAttendeeController {

    private final EventAttendeeService eventAttendeeService;

    private final EventRepository eventRepository;

    private final EventAttendeeRepository eventAttendeeRepository;

    private final EventAttendeeMapper mapper;

    public EventsAttendeeController(EventAttendeeService eventAttendeeService, EventRepository eventRepository, EventAttendeeRepository eventAttendeeRepository, EventAttendeeMapper mapper) {
        this.eventAttendeeService = eventAttendeeService;
        this.eventRepository = eventRepository;
        this.eventAttendeeRepository = eventAttendeeRepository;
        this.mapper = mapper;
    }


    @GetMapping
    public Page<EventAttendeeResource> getAllEventsAttendee(Pageable pageable){
        return mapper.modelListPage(eventAttendeeService.getAll(),pageable);
    }

    @GetMapping("attendees/{attendeeId}")
    public Page<EventAttendeeResource> getAllEventsByAttendeeId(@PathVariable Long attendeeId, Pageable pageable){
        return mapper.modelListPage(eventAttendeeService.getAllByAttendeeId(attendeeId),pageable);
    }

    @GetMapping("{eventId}")
    public Page<EventAttendeeResource> getAllAttendeesByEvent(@PathVariable Long eventId, Pageable pageable){
        return mapper.modelListPage(eventAttendeeService.getAllAttendeesByEventId(eventId),pageable);
    }

    @PostMapping("{eventId}/attendee/{attendeeId}")
    public ResponseEntity<?> addAttendeeToEvent(@PathVariable Long eventId, @PathVariable Long attendeeId){
        Event event=eventRepository.findById(eventId).orElseThrow(()->new RuntimeException("The event doesn't exist"));

        if(event.getAttendeesListByEvent()!=null){
            boolean attendeeExist=event.getAttendeesListByEvent().stream()
                    .anyMatch(attendee->attendee.getAttendeeId().equals(attendeeId));

            if(attendeeExist) return ResponseEntity.badRequest().body("These attendee already exist for the Event.");
        }

        event.addAttendee(event,attendeeId);
        eventRepository.save(event);

        return ResponseEntity.ok("Attendee was added correctly");
    }

}