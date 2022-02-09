package com.example.serseribf.controller;

import com.example.serseribf.service.ThingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/things")
public class ThingsController {

    private final ThingsService thingsService;

    @GetMapping("/selection")
    public ResponseEntity<?> getAllThings() {
        return ResponseEntity.ok((thingsService.getAllThings()));
    }
}
