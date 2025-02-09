package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ops", produces = MediaType.APPLICATION_JSON_VALUE)
public class OpsController {

    @GetMapping("/test")
    ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Test OK!");
    }
}
