package com.training.training.dateandtimeapi;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class instant
{
    public static void main(String[] args) {
        long currenttimemils=System.currentTimeMillis();
        System.out.println(currenttimemils);

        Instant instant=Instant.now();
        System.out.println(instant);

        //getting the instant datetime of the perticular zone
        ZonedDateTime zone=instant.atZone(ZoneId.of("America/Cuiaba"));

    }
}
