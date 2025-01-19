package com.company;

import java.util.Date;

public class CWH_96_date_time {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        long a = System.currentTimeMillis();              // gives time in milliseconds
        System.out.println("years passed since 1 Jan, 1970: " + a/1000/3600/24/365);

        System.out.println(Long.MAX_VALUE);

        Date d = new Date();            // import java.util.Date;
        System.out.println(d);           // Java date class has 4 methods.      Mutable: will keep on changing i.e. a dynamic one
        System.out.println(d.getTime());      // for each of the following, it will refer to 1st Jan, 1970 as the start year except for getYear().
        System.out.println(d.getDate());
        System.out.println(d.getYear());       // starts from 1900
        System.out.println(d.getMonth());      // starts from January
    }
}
