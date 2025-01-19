package com.company;
import java.util.Scanner;

public class CWH_19_Ch4PracticeSet {
    public static void main(String[] args) {
        /*Que 2 - Program to find out whether a student is pass or fail; if it requires total 40% & atleast 33% in each subjects to pass. Assume 3 subjects and take marks as Input from the user
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();

        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("Your overall percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congratulation!! you have passed");
        }
        else {
            System.out.println("Sorry!! you have failed");
        } */

        /*Que 2 - Calculate income tax paid by an employee to the govt as per follows:
        upto 2.5L = 0; 2.5L-5.0L = 5%; 5L-10L = 20%; Above 10L = 30%. Take user input.
         Slab/Range problem   */

        /*
        float i1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your income");
        i1 = in.nextFloat();

        if(i1>1000000) {
            System.out.println(0.3f*(i1-1000000) + 0.2f*(500000) + 0.05*(250000));
        }                                                                          //
        else if (i1>500000) {
            System.out.println(0.2f*(i1-500000) + 0.05*(250000));
        }
        else if (i1>250000) {
            System.out.println(0.05f*i1);
        }        //Always make a proper LADDER, otherwise it will get caught in associativity
        else {   //Or we can the Logical AND to provide Range
            System.out.println("0");
        }
        */

        float tax = 0;    // tax = 0 is initialized            //See this method later
        float income;     //Very important to understand Succession or Associativity
        System.out.println("Enter your annual income");
        Scanner sc = new Scanner(System.in);
        income = sc.nextFloat();

        if (income <= 250000) {
            tax = tax + 0;
        }
        else if (income>250000 && income<=500000) {
            tax = tax + (income - 250000)*0.05f + 0;
        }
        else if (income>500000 && income<=1000000) {
            tax = tax + (250000)*0.05f;
            tax = tax + (income-500000)*0.2f;
        }
        else if (income>1000000) {
            tax = tax + (250000)*0.05f;
            tax = tax + (500000)*0.20f;
            tax = tax + (income - 1000000)*0.30f;
        }

        System.out.println("Total tax payable is " + tax);  //Necessary to print tax

        //Find out the day of week given the number.. eg 1 for Monday

        System.out.println("Enter the day number");
        Scanner sd = new Scanner(System.in);
        int day = 0;
        day = sd.nextInt();

        if (day>7) {
            day = day - 7;   //only true upto 14
        }

        //Alt + Enter for enhanced switch, provides concise code1
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        //Write a Java Program find whether entered year is a leap year or not. There are three conditions for Leap year.
        // Year must be divisible by 4; Divisible by 100 as well as 400.

        System.out.println("Enter the year");
        Scanner aa = new Scanner(System.in);
        int year;
        year = aa.nextInt();
        int b = (year % 4) +(year % 100) + (year % 400);
        System.out.println(b);

        if (b==0) {
            System.out.println("Yes " + year + " is a Leap Year");
        }
        else {
            System.out.println("No " + year + " is not a leap year");
        }

        // Write a java program to find out the type of website from the given url: .com = commercial
        //  .org = organizational      .in = Indian

        System.out.println("Enter the url");
        Scanner wb = new Scanner(System.in);
        String url = wb.nextLine();

        int x, y, z;
        x = url.indexOf(".com");
        y = url.indexOf(".org");
        z = url.indexOf(".in");

        if (x>0 && y>0 || y>0 && z>0 || x>0 && z>0) {
            System.out.println("Incorrect website name");
        }
        else if (x>0) {
            System.out.println("Commercial Website");
        }
        else if (y>0) {
            System.out.println("Organizational Website");
        }
        else if (z>0) {
            System.out.println("Indian Website");
        }
        else {
            System.out.println("None of these");
        }


























    }
}
