package com.example.DoctorAppointmentBooking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAuthentCation")
public class PatientAuthenticationToken {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer tokenId;
    private String tokenValue;
    private LocalDateTime tokenCreationTime;


    //each token should be linked to one patient

    @OneToOne
    @JoinColumn(name = "fk_PatientId")
    Patient patient;

    public PatientAuthenticationToken(Patient patient) {
        this.patient = patient;
        this.tokenCreationTime=LocalDateTime.now();
        this.tokenValue= UUID.randomUUID().toString();

    }
}
