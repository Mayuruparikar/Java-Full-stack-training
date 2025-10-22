package com.training.training.multipleconfig;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
@Profile("prod")
public class Prod {
    @Value("${prod.user}")
    private String username;

    @Autowired
    private Dev dev;

    @Value("${prod.password}")
    private String password;
    @PostConstruct
    public void printDetails() {
        System.out.println("this is prod config");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("hash of the singleton bean dev in the  prod: "+dev.hashCode());
    }

}
