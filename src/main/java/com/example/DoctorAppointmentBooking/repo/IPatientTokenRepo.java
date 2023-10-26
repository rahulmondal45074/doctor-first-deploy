package com.example.DoctorAppointmentBooking.repo;

import com.example.DoctorAppointmentBooking.model.PatientAuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientTokenRepo extends JpaRepository<PatientAuthenticationToken,Integer> {
}
