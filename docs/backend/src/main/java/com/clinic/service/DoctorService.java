package com.clinic.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DoctorService {

```
public List<String> getAvailableTimeSlots(
        Long doctorId,
        LocalDate date) {

    if (date != null) {
        return Arrays.asList(
                "09:00 AM",
                "11:00 AM",
                "02:00 PM");
    }

    return Arrays.asList();
}

public Map<String, Object> validateDoctorLogin(
        String email,
        String password) {

    Map<String, Object> response = new HashMap<>();

    if ("doctor@clinic.com".equals(email)
            && "password".equals(password)) {

        response.put("success", true);
        response.put("message", "Login successful");

    } else {

        response.put("success", false);
        response.put("message", "Invalid credentials");
    }

    return response;
}
```

}
