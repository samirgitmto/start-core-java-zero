package com.company;

import java.util.Calendar;
import java.util.TimeZone;

public class CWH_98_Calendar_class {
    public static void main(String[] args) {
//        Calendar class is an abstract class. So, we can't create its instance.
//        But it has static method inside its class, which provides for an instance based on current time.
        Calendar b = Calendar.getInstance();
        System.out.println(b.getCalendarType());      // Gregorian Calendar: one we use.
        System.out.println(b.getTimeZone());

        System.out.println("");
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
    }
}
