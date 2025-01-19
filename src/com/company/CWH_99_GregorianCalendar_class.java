package com.company;

import java.util.*;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//import java.util.TimeZone;

public class CWH_99_GregorianCalendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Hour: " + c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println("Hour of the day: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.print("Railway Clock: ");
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

//        GregorianCalendar is a concrete subclass of Calendar & provides the std calendar sys for most of world.
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println(gcal.isLeapYear(2020));
        System.out.println(gcal.isLeapYear(2019));

//        TimeZone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[263]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
    }
}
