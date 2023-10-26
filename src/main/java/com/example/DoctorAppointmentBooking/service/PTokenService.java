package com.example.DoctorAppointmentBooking.service;

import com.example.DoctorAppointmentBooking.model.PatientAuthenticationToken;
import com.example.DoctorAppointmentBooking.repo.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PTokenService {

    @Autowired
    IPatientRepo iPatientRepo;


//    public void createToken(PatientAuthenticationToken token) {
//        iPatientRepo.save(token);
//    }
}
