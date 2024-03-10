package com.example.booking.mapping;

import com.example.booking.domain.model.EventPayment;
import com.example.booking.resource.CreateEventPaymentResource;
import com.example.booking.resource.EventPaymentResource;
import com.example.booking.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class EventPaymentMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    public EventPaymentResource toResource(EventPayment model){

        return mapper.map(model,EventPaymentResource.class);
    }

    public Page<EventPaymentResource> modelListPage(List<EventPayment> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,EventPaymentResource.class),pageable, modelList.size());
    }

    public EventPayment toModel(CreateEventPaymentResource resource){ return mapper.map(resource,EventPayment.class); }

}
