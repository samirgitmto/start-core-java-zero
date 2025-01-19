package com.company;
import java.util.Scanner;

public class CWH_18_ElseIf_Switch {
    public static void main(String[] args) {
        /*
        int exp;
        System.out.println("Enter your experience");
        Scanner ex = new Scanner(System.in);
        exp = ex.nextInt();
        if (exp>20) {
            System.out.println("Expert");   //See the LADDER. Decreasing wise exprience
        }
        else if(exp>10) {
            System.out.println("Pro");
        }
        else if(exp>5) {
            System.out.println("Beginner");
        }
        else{
            System.out.println("you are not experienced enough");
        }
        // This is a proper LADDER
        */

        // switch(var)  var can be an integer, string or character in JAVA
        // try enhanced switch later

        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("gonna be an adult");
                break;   //breaks are must
            case 23:
                System.out.println("get a job");
                //break;  //if breaks are not used; then each code will run simultaneously
            case 60:
                System.out.println("retired");
                //break;
            default:
                System.out.println("Enjoy your life!");
        }
    }
}
