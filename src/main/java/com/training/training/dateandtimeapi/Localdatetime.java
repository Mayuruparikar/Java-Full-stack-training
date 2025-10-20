package com.training.training.dateandtimeapi;

import java.time.LocalDateTime;

public class Localdatetime {
    public static void main(String[] args) {
        LocalDateTime currentdt=LocalDateTime.now();
        System.out.println(currentdt);

        //parsing
       LocalDateTime newtime=LocalDateTime.parse("2002-06-17T14:20");
        System.out.println(newtime);
    }
}
