package com.example.booking.resource;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateEventResource {

    @NotNull
    @NotBlank
    @Size(max= 50)
    @Column(unique = true)
    private String name;

    @Size(max =240)
    private String address;

    @NotNull
    private int capacity;

    @Size(max = 500)
    private String image;

    @NotNull
    private Date date;


    @NotNull
    private int cost;

    @Size(max = 50)
    @NotNull
    private String district;

/*    @NotNull
    private Long organizerId;*/




}
