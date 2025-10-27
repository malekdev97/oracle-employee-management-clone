package com.artcode.artcode.controllers;

import com.artcode.artcode.models.Employee;
import com.artcode.artcode.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/test")
    public ResponseEntity<?> testEndpoint() {
        return ResponseEntity.ok("API is working");
    }

    @GetMapping
    public ResponseEntity<?> getAll() {

        return ResponseEntity.ok(employeeRepository.findAll());
    }
}
