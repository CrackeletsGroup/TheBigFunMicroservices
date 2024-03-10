package com.example.payment.domain.model;

import com.example.payment.shared.domain.model.AuditModel;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "payments")
public class Payment extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date date;

    @NotNull
    @NotBlank
    @Size(max=500)
    //@Column(unique = true)
    private String qrImg;


/*    @NotNull
    private Long organizerId;

    @NotNull
    private Long eventId;

    @NotNull
    private Long attendeeId;*/
}