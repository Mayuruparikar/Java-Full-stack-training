package com.training.training.jpabasics;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("/city/{city}")
    public List<Student> getByCity(@PathVariable String city) {
        return service.getStudentsByCity(city);
    }

    @GetMapping("/age/{age}")
    public List<Student> getAboveAge(@PathVariable int age) {
        return service.getStudentsAboveAge(age);
    }

    @GetMapping("/search/{name}")
    public List<Student> searchByName(@PathVariable String name) {
        return service.searchStudentsByName(name);
    }

    @GetMapping("/named/city/{city}")
    public List<Student> getByCityNamed(@PathVariable String city) {
        return service.getStudentsByCityNamed(city);
    }


    @GetMapping("/named/age/{age}")
    public List<Student> getAboveAgeNamed(@PathVariable int age) {
        return service.getStudentsAboveAgeNamed(age);
    }
}
