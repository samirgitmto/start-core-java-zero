package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CWH_101_Date_Time_formatter {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();               // date
        System.out.println(ldt);

//        DateTimeFormatter dfnew = DateTimeFormatter.ofPattern("|dd||MM||yyyy|");     // user defined format
        DateTimeFormatter dfnew = DateTimeFormatter.ofPattern("|dd||MM||yyyy|--E H:m a");    // localised day
        String myDate = ldt.format(dfnew);               // String object to make date ldt in the new format dfnew.
        System.out.println(myDate);

        DateTimeFormatter defnew = DateTimeFormatter.ISO_LOCAL_DATE;
        String midate = ldt.format(defnew);
        System.out.println(midate);
    }
}
