package com.archna.myportfolio.contact;

import jakarta.validation.Valid;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @PostMapping
    public ResponseEntity<Map<String, String>> submitContact(
            @Valid @RequestBody ContactRequest request) {

        // Starter version: validate the request, but do not store personal data.
        // We can connect MySQL and email delivery in a later step.
        return ResponseEntity.ok(Map.of(
                "message", "Thanks, " + request.getName()
                        + "! The form was validated. Message storage is not configured yet."
        ));
    }
}
