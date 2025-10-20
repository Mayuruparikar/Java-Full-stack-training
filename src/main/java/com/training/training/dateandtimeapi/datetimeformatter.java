package com.training.training.dateandtimeapi;

import ch.qos.logback.core.encoder.JsonEscapeUtil;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {

       String date = "21/06/2002";
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsed=LocalDate.parse(date,dateTimeFormatter);
        System.out.println(parsed);
    }

}
