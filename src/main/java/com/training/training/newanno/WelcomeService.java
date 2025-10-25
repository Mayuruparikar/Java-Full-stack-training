package com.training.training.newanno;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String message() {
        return "Hello, this is constructor injection";
    }
}
