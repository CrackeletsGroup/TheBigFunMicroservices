package com.example.booking.mapping;

import com.example.booking.domain.model.EventAttendee;
import com.example.booking.resource.CreateEventAttendeeResource;
import com.example.booking.resource.EventAttendeeResource;
import com.example.booking.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class EventAttendeeMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    public EventAttendeeResource toResource(EventAttendee model){
        return mapper.map(model,EventAttendeeResource.class); }

    public Page<EventAttendeeResource> modelListPage(List<EventAttendee> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,EventAttendeeResource.class),pageable,modelList.size());
    }

    public EventAttendee toModel(CreateEventAttendeeResource resource){ return mapper.map(resource,EventAttendee.class);}

    //public EventAttendee toModel(UpdateAttendeeResource resource){ return mapper.map(resource,EventAttendee.class);}

}
