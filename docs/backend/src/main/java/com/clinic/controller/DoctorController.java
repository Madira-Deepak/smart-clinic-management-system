package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/availability")
    public ResponseEntity<String> getAvailability(
            @RequestParam String specialty,
            @RequestParam String date,
            @RequestHeader("Authorization") String token) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.badRequest().body("Invalid token");
        }

        return ResponseEntity.ok(
                "Available doctors for " + specialty + " on " + date);
    }
}