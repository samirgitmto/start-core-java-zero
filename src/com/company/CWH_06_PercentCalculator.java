package com.company;

import java.util.Scanner;

public class CWH_06_PercentCalculator {
    public static void main(String[] args) {
        System.out.println("Percentage of marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject 1 marks");
        int a = sc.nextInt();
        System.out.println("enter subject 2 marks");
        int b = sc.nextInt();
        System.out.println("enter subject 3 marks");
        int c = sc.nextInt();
        System.out.println("enter subject 4 marks"); //sc is not a keyword
        int d = sc.nextInt();
        System.out.println("enter subject 5 marks");
        int e = sc.nextInt();
        System.out.print("Percentage of marks = ");
        int percentage = (a + b + c + d + e)/5;
//        int percent = sum/5;
//        System.out.println("the percentage of marks is ");
        System.out.println(percentage);
    }
}
