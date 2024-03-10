package com.example.profile.mapping;

import com.example.profile.domain.model.Organizer;
import com.example.profile.resource.CreateOrganizerResource;
import com.example.profile.resource.OrganizerResource;
import com.example.profile.resource.UpdateOrganizerResource;
import com.example.profile.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public class OrganizerMapper implements Serializable {

    @Autowired //With this I can do dependency injection
    EnhancedModelMapper mapper;

    public OrganizerResource toResource(Organizer model){

        return mapper.map(model,OrganizerResource.class);
    }

    public Organizer toModel(CreateOrganizerResource resource){

        return mapper.map(resource,Organizer.class);
    }



    public Organizer toModel(UpdateOrganizerResource resource){

        return mapper.map(resource,Organizer.class);
    }

    //to make the distribution we use something similar to the "paginator"
    public Page<OrganizerResource> modelListPage(List<Organizer> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList,OrganizerResource.class),pageable,modelList.size());
    }


}
