package com.example.booking.mapping;

import com.example.booking.domain.model.Event;
import com.example.booking.resource.CreateEventResource;
import com.example.booking.resource.EventResource;
import com.example.booking.resource.UpdateEventResource;
import com.example.booking.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class EventMapper implements Serializable {


    @Autowired
    private EnhancedModelMapper mapper;

    public EventResource toResource(Event model){
        return mapper.map(model, EventResource.class);}

    public Page<EventResource> modelListPage(List<Event> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, EventResource.class), pageable, modelList.size());
    }

    public Event toModel(CreateEventResource resource){ return mapper.map(resource, Event.class);}

    public Event toModel(UpdateEventResource resource){ return mapper.map(resource, Event.class);}
}
