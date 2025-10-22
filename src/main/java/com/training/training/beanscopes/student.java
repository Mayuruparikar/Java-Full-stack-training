package com.training.training.beanscopes;

import com.training.training.multipleconfig.Prod;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
    @Autowired
    private Prod prod;

    @PostConstruct
    public void printDetails() {
        System.out.println("hash of the prototype bean prod  in the  student:  "+prod.hashCode());
    }
}

//the request scope only creates the bean object when the api is requested and for each requests the object will be different for the different api heat
//but same throughout for one api call




