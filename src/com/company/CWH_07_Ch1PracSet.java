package com.company;

import java.util.Scanner;

public class CWH_07_Ch1PracSet {
    //Que1 - Ask the user name and greet them with "Hello
    // <Name> have a good day"
    public static void main(String[] args) {
//        System.out.println("What is your name");
//        Scanner ab = new Scanner(System.in);
//        String name = ab.next();
//        System.out.println("Hello " + name + " have a good day");
    //Que2 - Convert km into miles
//        System.out.println("Enter km");
//        Scanner sc = new Scanner(System.in);
//        float a = sc.nextFloat();
//        float b = a*0.621371f;
//        System.out.print(b);
//        System.out.print(" miles");
    //Que3 - Number entered is integer or not
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
//        boolean a = sc.hasNextInt(); //boolean not necessary; hasNext is the key
        System.out.println(sc.hasNextInt());
    }
}
