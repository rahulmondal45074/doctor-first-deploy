package com.example.DoctorAppointmentBooking.controller;

import com.example.DoctorAppointmentBooking.model.Patient;
import com.example.DoctorAppointmentBooking.model.dto.SignInInputDto;
import com.example.DoctorAppointmentBooking.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("patient/signup")
    public String patientSignUp(@RequestBody  Patient patient){
         return patientService.patientSignUp(patient);
    }

//    @PostMapping("patient/signIn")
//    public String patientSignIn(@RequestBody SignInInputDto signInInputDto){
//        return patientService.patientSignIn(signInInputDto);
//    }
}
