package com.company;
import java.util.Scanner;

public class ACCIOJOB {
    public static void main(String[] args) {
//        System.out.println("type of triangle");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int a2 = 2*a*a;
//        int b = sc.nextInt();
//        int b2 = 2*b*b;
//        int c = sc.nextInt();
//        int c2 = 2*c*c;
//
//        if (a>=b && a>c) {
//            if (a2 > (b2 + c2)) {
//                System.out.println("3");
//            }
//            else if (a2 == (b2 + c2)) {
//                System.out.println("2");
//            }
//            else if (a2 < (b2 + c2)) {
//                System.out.println("1");
//            }
//        }
//        else if (b>=a && b>c) {
//            if (b2 > (a2 + c2)) {
//                System.out.println("3");
//            }
//            else if (b2 == (a2 + c2)) {
//                System.out.println("2");
//            }
//            else if (b2 < (a2 + c2)) {
//                System.out.println("1");
//            }
//        }
//        else if (c>=a && c>b || c>=b) {
//            if (c2 > (a2 + b2)) {
//                System.out.println("3");
//            }
//            else if (c2 == (a2 + b2)) {
//                System.out.println("2");
//            }
//            else if (c2 < (a2 + b2)) {
//                System.out.println("1");
//            }
//        }
//        else if (a==b && a == c) {
//            System.out.println("1");
//        }

//        System.out.println("celsius to fahrenheit");
////        Scanner sc = new Scanner(System.in);
//        int C = sc.nextInt();
//        int D = 0;
//        D = (C * 9)/5 + 32;
//        System.out.println(D);
//
//        int X = sc.nextInt();
//        int Y = 0;
//        Y = (X * 9)/5 + 32;
//        System.out.println(Y);

//        System.out.println("find the quadrant using loops");
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        while (x>0) {
//            if (y>0) {
//                System.out.println("1");
//            }
//            else if (y<0) {
//                System.out.println("4");
//            }
//            break;
//        }
//        while (x<0) {
//            if (y>0) {
//                System.out.println("2");
//            }
//            else if (y<0) {
//                System.out.println("3");
//            }
//            break;
//        }

//        System.out.println("Sum of fist N natural numbers");
//        int N = sc.nextInt();
//        int sum = 0;
//        for (int i=1; i<=N; i++) {
//            sum = i + sum;
//        }
//        System.out.println(sum);

        /* Given a number N, you need to check whether the given number is a Palindrome or not. A number is said to be Palindrome when it
        reads the same from backward as forward. Check whether input number N is a palindrome or not. Print "true" if it is a palindrome or "false" otherwise */
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int reverse = 0;
//        while (N!=0) {
//            int remainder = N % 10;
//            reverse = reverse*10 + remainder;
//            N = N/10;
//        }
//        System.out.println("Reverse of the number is " + reverse);

        int N, remainder, temp, reverse = 0;
        N = sc.nextInt();
        temp = N;        //Helps to prevent altering the original value
        while (temp>0) {
            remainder = temp % 10;
            reverse = reverse*10 + remainder;
            temp = temp/10;
        }
        System.out.println("Reverse of the number is " + reverse);
        if (N == reverse) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

