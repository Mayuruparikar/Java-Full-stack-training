package com.training.training.beanscopes;

import com.training.training.multipleconfig.Dev;
import com.training.training.multipleconfig.Prod;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class beanDemo {
        //Dev bean with the singleton scope
        @Autowired
        private Dev dev;

        @Autowired
        private Prod prod;

        @PostConstruct
        public void printDetails() {
            System.out.println("hash in the singletean bean dev in beanscope : "+dev.hashCode());
            System.out.println("hash in the prototype bean prod in the beanscope : "+prod.hashCode());
        }
    }


