package com.example.profile.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("profileMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public OrganizerMapper organizerMapper(){ return new OrganizerMapper(); }

    @Bean
    public AttendeeMapper attendeeMapper() {
        return new AttendeeMapper();
    }

    @Bean
    public OrganizerEventMapper organizerEventMapper(){return new OrganizerEventMapper();}


}
