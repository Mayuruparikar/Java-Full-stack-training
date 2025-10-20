package com.training.training.dateandtimeapi;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.Month;

public class LocaldateDemo {
    public static void main(String[] args) {
        //current date
        LocalDate now = LocalDate.now();
        System.out.println(now);
        //for printing the day month and yr individually
        int day= now.getDayOfMonth();
        Month month=now.getMonth();
        int monthval=now.getMonthValue();
        int year=now.getYear();
        System.out.println(day+"/"+month+"/"+year+"month number is "+monthval);
        System.out.println("for yesterday ");
        LocalDate yesterday=now.minusDays(1);
        System.out.println(yesterday);

        System.out.println("for pastdate");
        LocalDate pastdate=now.minusMonths(100);
        System.out.println(pastdate);

        if(now.isAfter(yesterday))
        {
            System.out.println("ye sach hai ");
        }


        //any custom date
        System.out.println("custom date");
       LocalDate customdate= LocalDate.of(1990,05,17);
        System.out.println(customdate);
    }
}
