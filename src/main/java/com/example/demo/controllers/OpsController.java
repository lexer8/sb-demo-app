package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ops")
public class OpsController {

    @GetMapping("/test")
    ResponseEntity<String> getTest() {
        return ResponseEntity.ok("Test OK!");
    }
}
