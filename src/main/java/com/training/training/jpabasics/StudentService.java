package com.training.training.jpabasics;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repo;

    public List<Student> getStudentsByCity(String city) {
        return repo.getStudentsByCity(city);
    }

    public List<Student> getStudentsAboveAge(int age) {
        return repo.getStudentsAboveAge(age);
    }

    public List<Student> searchStudentsByName(String name) {
        return repo.searchStudentsByName(name);
    }

    // Using Named Query
    public List<Student> getStudentsByCityNamed(String city) {
        return repo.findByCity(city);
    }

    // Using Named Native Query
    public List<Student> getStudentsAboveAgeNamed(int age) {
        return repo.findByAge(age);
    }
}
