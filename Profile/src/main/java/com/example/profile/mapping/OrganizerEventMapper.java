package com.example.profile.mapping;

import com.example.profile.domain.model.OrganizerEvent;
import com.example.profile.resource.CreateOrganizerEventResource;
import com.example.profile.resource.OrganizerEventResource;
import com.example.profile.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class OrganizerEventMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    public OrganizerEventResource toResource(OrganizerEvent model){
        return mapper.map(model,OrganizerEventResource.class);
    }

    public Page<OrganizerEventResource> modelListPage(List<OrganizerEvent> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,OrganizerEventResource.class),pageable, modelList.size());
    }

    public OrganizerEvent toModel(CreateOrganizerEventResource resource){ return mapper.map(resource,OrganizerEvent.class); }

}