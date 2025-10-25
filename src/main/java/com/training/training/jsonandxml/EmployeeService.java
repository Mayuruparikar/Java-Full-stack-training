package com.training.training.jsonandxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public Employee saveEmployee(Employee emp) {
        return repo.save(emp);
    }

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
