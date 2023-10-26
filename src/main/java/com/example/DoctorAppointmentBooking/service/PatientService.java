package com.example.DoctorAppointmentBooking.service;

import com.example.DoctorAppointmentBooking.model.Patient;
import com.example.DoctorAppointmentBooking.model.PatientAuthenticationToken;
import com.example.DoctorAppointmentBooking.model.dto.SignInInputDto;
import com.example.DoctorAppointmentBooking.repo.IPatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class PatientService {

    @Autowired
    IPatientRepo iPatientRepo;

    @Autowired
    PTokenService pTokenService;

    public String patientSignUp(Patient patient) {

        String newEmail=patient.getPatientEmail();
        Patient existingPatient = iPatientRepo.findFirstByPatientEmail(newEmail);
        if (existingPatient != null)
        {
            return "email already in use ";
        }

        String signUpPassword = patient.getPatientPassword();
        try {
            String encryptPassword = PasswordEncryptor.encrypt(signUpPassword);
            patient.setPatientPassword(encryptPassword);
            iPatientRepo.save(patient);
            return "patient register";
        } catch (NoSuchAlgorithmException e) {
            return "Internal server issue while saving password try again latter";
        }
    }

//    public String patientSignIn(SignInInputDto signInInputDto) {
//
//        String email=signInInputDto.getEmail();
//        Patient existingPatient=iPatientRepo.findFirstByPatientEmail(email);
//        if (existingPatient == null){
//            return "invalid email please sign up first";
//        }
//
//        String password=signInInputDto.getPassword();
//        try {
//            String encryptedPassword=PasswordEncryptor.encrypt(password);
//            if (existingPatient.getPatientPassword().equals(encryptedPassword)){
//               // return a token
//                PatientAuthenticationToken token= new PatientAuthenticationToken(existingPatient);
//                pTokenService.createToken(token);
//
//            }
//            else{
//                return "invalid credentials";
//            }
//        } catch (NoSuchAlgorithmException e) {
//            return "internal server error ";
//        }
//        return "error";
//    }
}
