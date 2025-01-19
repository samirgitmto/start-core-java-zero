package com.company;

//public class CWH_34_Recursions {     //Java talking to itself
    // factorial(0) = 1
    // factorial(n) = n * n-1 *......1
    // factorial(n) = n * factorial(n-1)
//    static int factorial(int n) {
//        if (n==0 || n==1) {
//            return 1;
//        }
//        else{
//            return n * factorial(n-1);
//        }
//    }
//    static int factorial_iterative(int n) {
//        if (n==0 || n==1) {
//            return 1;
//        }
//        else {
//            int product = 1;
//            for (int i=1; i<=n; i++) {
//                product = product*i;
//            }
//            return product;
//        }
//    }
//    static int fib(int f) {
//        if (f == 0) {
//        if ( f >= 1) {
//           return fib(f - 1) + fib( f - 2);
//        }
//        return f;
//    }

//    public static void main(String[] args) {
//        int x = 5;
//        System.out.println("Value of factorial " + x + " is: " + factorial(x));
//        System.out.println("Value of factorial " + x + " is: " + factorial_iterative(x));
//
//        // print fibonacci series:
//        // The Fibonacci sequence is a type series where each number is the sum of the two that precede it. It starts from 0 and 1 usually.
//        // The Fibonacci sequence is given by 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on.
//        int f = 6;
//        System.out.println(fib(f));