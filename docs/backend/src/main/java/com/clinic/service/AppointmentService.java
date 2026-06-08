package com.clinic.service;

import com.clinic.model.Appointment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    public Appointment bookAppointment(Appointment appointment) {
        return appointment;
    }

    public List<Appointment> getAppointmentsByDoctorAndDate(
            Long doctorId,
            LocalDate date) {

        return new ArrayList<>();
    }
}