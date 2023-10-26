package com.example.DoctorAppointmentBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String patientName;

    @Email
    private String patientEmail;

    private String patientPassword;
    private Gender patientGender;
    private BooldGroup patientBooldGroup;
    private String patientContact;
    private LocalDateTime patientDateOfBirth;



}
