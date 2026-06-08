package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

```
@PostMapping("/{token}")
public ResponseEntity<Map<String, String>> savePrescription(
        @PathVariable String token,
        @RequestBody String prescription) {

    Map<String, String> response = new HashMap<>();

    if (token == null || token.isBlank()) {
        response.put("message", "Invalid token");
        return ResponseEntity.badRequest().body(response);
    }

    response.put("message", "Prescription saved successfully");

    return ResponseEntity.ok(response);
}
```

}
