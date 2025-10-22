package com.training.training.multipleconfig;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//singleton by default
@Component
@Profile("dev")
public class Dev {
    @Value("${dev.user}")
    private String username;


    @Value("${dev.password}")
    private String password;
    @PostConstruct
    public void printDetails() {
        System.out.println("this is dev config");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);


    }

}
