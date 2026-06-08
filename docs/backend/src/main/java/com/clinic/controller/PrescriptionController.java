package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @PostMapping
    public ResponseEntity<String> savePrescription(
            @RequestHeader("Authorization") String token,
            @RequestBody String prescription) {

        if (token == null || token.isBlank()) {
            return ResponseEntity.badRequest()
                    .body("Invalid token");
        }

        return ResponseEntity.ok(
                "Prescription saved successfully");
    }
}