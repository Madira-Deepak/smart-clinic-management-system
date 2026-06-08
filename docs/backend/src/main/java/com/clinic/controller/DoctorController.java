package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/{user}/{doctorId}/{date}/{token}")
    public ResponseEntity<Map<String, Object>> getAvailability(
            @PathVariable String user,
            @PathVariable Long doctorId,
            @PathVariable String date,
            @PathVariable String token) {

        Map<String, Object> response = new HashMap<>();

        if (token == null || token.isBlank()) {
            response.put("success", false);
            response.put("message", "Invalid token");

            return ResponseEntity.badRequest().body(response);
        }

        response.put("success", true);
        response.put("user", user);
        response.put("doctorId", doctorId);
        response.put("date", date);
        response.put("message", "Doctor availability retrieved successfully");

        return ResponseEntity.ok(response);
    }
}