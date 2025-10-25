package com.training.training.newanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final WelcomeService welcomeService; // Constructor Injection

    @Autowired
    private LazyService lazyService; // Field Injection (NOT best practice - only for knowledge)

    private PropertyService propertyService; // Setter Injection

    public ApiController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @Autowired
    public void setPropertyService(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/welcome")
    public String constructorInjectionExample() {
        return welcomeService.message();
    }

    @GetMapping("/lazy-info")
    public String lazyBeanExample() {
        return lazyService.lazyMessage();
    }

    @GetMapping("/owner-info")
    public String ownerDetails() {
        return propertyService.ownerInfo();
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id) {
        return "User retrieved with ID: " + id;
    }

    @GetMapping("/search")
    public String searchUser(@RequestParam String name) {
        return "Search results for: " + name;
    }

    @PostMapping("/user")
    public String createUser(@RequestBody String user) {
        return "User received: " + user;
    }
}
