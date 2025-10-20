package com.training.training.dateandtimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class duration {
    public static void main(String[] args) {
        Instant start =Instant.now();
        int sum=0;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant end=Instant.now();
        Duration d1=Duration.between(start,end);
        System.out.println(d1);
        Duration d2=Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d2);
    }
}
