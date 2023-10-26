package com.example.DoctorAppointmentBooking.service;

import jakarta.xml.bind.DatatypeConverter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptor {

    public static String encrypt(String unHashedPassword) throws NoSuchAlgorithmException {
        MessageDigest md5=MessageDigest.getInstance("MD5");//we can whatever hashing algo we want

        md5.update(unHashedPassword.getBytes());
        byte[]digested=md5.digest();
        return DatatypeConverter.printHexBinary(digested);

    }
}
