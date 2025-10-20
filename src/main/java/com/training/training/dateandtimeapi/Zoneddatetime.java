package com.training.training.dateandtimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Zoneddatetime {
    public static void main(String[] args) {
        ZonedDateTime now=ZonedDateTime.now();
        System.out.println("india time: "+now);

        Set<String>Zoneids= ZoneId.getAvailableZoneIds();
        Zoneids.forEach(System.out::println);

        ZonedDateTime custom=ZonedDateTime.of(2000,12,25,14,30,24,30,ZoneId.of("America/Cuiaba"));
        System.out.println(custom);


    }
}
