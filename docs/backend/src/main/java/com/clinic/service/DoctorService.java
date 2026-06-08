package com.clinic.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class DoctorService {

    public List<String> getAvailableTimeSlots(
            Long doctorId,
            LocalDate date) {

        return Arrays.asList(
                "09:00 AM",
                "11:00 AM",
                "02:00 PM");
    }

    public Map<String, Object> validateDoctorLogin(
            String email,
            String password) {

        return Map.of(
                "success", true,
                "message", "Login successful");
    }
}