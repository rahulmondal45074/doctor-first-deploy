package com.example.DoctorAppointmentBooking.repo;

import com.example.DoctorAppointmentBooking.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient,Integer> {
    Patient findFirstByPatientEmail(String newEmail);
}
