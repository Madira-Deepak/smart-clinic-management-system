package com.clinic.service;

import com.clinic.model.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AppointmentService {

```
@Autowired
private AppointmentRepository appointmentRepository;

public Appointment bookAppointment(Appointment appointment) {
    return appointmentRepository.save(appointment);
}

public List<Appointment> getAppointmentsByDoctorAndDate(
        Long doctorId,
        LocalDate date) {

    return appointmentRepository
            .findByDoctorIdAndDate(doctorId, date);
}
```

}
