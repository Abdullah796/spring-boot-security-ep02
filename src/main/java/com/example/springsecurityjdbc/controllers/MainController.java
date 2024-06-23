package com.example.springsecurityjdbc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    @GetMapping("/")
    public ResponseEntity<String> getHomeRoute() {
        return ResponseEntity.ok("<h1>Hey welcome to home route</h1>");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdminRoute() {
        return ResponseEntity.ok("<h1>Hey welcome to admin route</h1>");
    }

    @GetMapping("/user")
    public ResponseEntity<String> getUserRoute() {
        return ResponseEntity.ok("<h1>Hey welcome to user route</h1>");
    }

}
