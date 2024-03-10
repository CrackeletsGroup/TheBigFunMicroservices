package com.example.profile.api.rest;

import com.example.profile.domain.service.EventFilterService;
import com.example.profile.domain.service.OrganizerService;
import com.example.profile.mapping.OrganizerMapper;
import com.example.profile.resource.CreateOrganizerResource;
import com.example.profile.resource.OrganizerResource;
import com.example.profile.resource.UpdateOrganizerResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api/v1/organizers", produces="application/json")
public class OrganizersController {

    private OrganizerService organizerService;
    private OrganizerMapper organizerMapper;


    private EventFilterService eventFilterService;




    public OrganizersController(OrganizerService organizerService, OrganizerMapper mapper1) {
        this.organizerService = organizerService;
        this.organizerMapper = mapper1;

    }

    @GetMapping
    public Page<OrganizerResource> getAllOrganizers(Pageable pageable){
        return organizerMapper.modelListPage(organizerService.getAll(),pageable);
    }

    @GetMapping("byname/{name}")
    public OrganizerResource getByName(@PathVariable String name){
        return organizerMapper.toResource(organizerService.getByName(name));
    }


    @GetMapping("{organizerId}")          //"PathVariable": reconoce la variable de esta linea
    public OrganizerResource getOrganizerById(@PathVariable Long organizerId){
        return organizerMapper.toResource(organizerService.getById(organizerId));
    }


    @PostMapping
    public ResponseEntity<OrganizerResource> createOrganizer(@RequestBody CreateOrganizerResource resource){

        return new ResponseEntity<>(organizerMapper.toResource(organizerService.create(organizerMapper.toModel(resource))), HttpStatus.CREATED);
    }

    @PutMapping("{organizerId}")
    public OrganizerResource updateOrganizer(@PathVariable Long organizerId,
                                             @RequestBody UpdateOrganizerResource resource){
        return organizerMapper.toResource(organizerService.update(organizerId,organizerMapper.toModel(resource)));
    }

    @DeleteMapping("{organizerId}")
    public ResponseEntity<?> deleteOrganizer(@PathVariable Long organizerId){
        return organizerService.delete(organizerId);
    }

}
