package com.training.training.dateandtimeapi;

import java.time.LocalTime;

public class LocaltimeDemo {
    public static void main(String[] args) {
        LocalTime currenttime=LocalTime.now();
        System.out.println(currenttime);

        //minus time
        LocalTime previoustime=currenttime.minusHours(5);
        System.out.println(previoustime);

        LocalTime custom=LocalTime.of(12,23,45);
        System.out.println(custom);

        String timeinstring="14:45:37";
        LocalTime parsedtime=LocalTime.parse(timeinstring);
        System.out.println(parsedtime);
    }
}
