package com.training.training.jsonandxml;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping(
            path = "/addemployee",
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"}
    )
    public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employee) {
        try {
            Employee saved = service.saveEmployee(employee);
            if (saved != null) {
                return ResponseEntity.status(HttpStatus.CREATED).body(saved);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Failed to create employee due to an unknown error.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Error: " + e.getMessage());
        }
    }

    @GetMapping(
            path = "/employees",
            produces = {"application/json", "application/xml"}
    )
    public ResponseEntity<?> getAllEmployees() {
        List<Employee> employees = service.getAllEmployees();
        if (employees == null || employees.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(employees);
    }
}
