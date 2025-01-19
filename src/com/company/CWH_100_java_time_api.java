package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CWH_100_java_time_api {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();         // immutable date objects
        System.out.println(ld);
        System.out.println("");
        LocalTime lt = LocalTime.now();              // nanoseconds
        System.out.println(lt);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalTime lt2 = LocalTime.now();              // nanoseconds
        System.out.println(lt2);
    }
}
