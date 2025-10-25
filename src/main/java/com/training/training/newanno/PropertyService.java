package com.training.training.newanno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Value("${app.owner:Default Owner}")
    private String owner;

    public String ownerInfo() {
        return "App Owner: " + owner;
    }
}

