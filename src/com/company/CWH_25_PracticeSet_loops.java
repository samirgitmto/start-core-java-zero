package com.company;

public class CWH_25_PracticeSet_loops {
    public static void main(String[] args) {
        /* Que1 - Print the following pattern
         * * * *
         * * *
         * *
         *
         */
/*
        for (int i = 4; i != 0; i--) {
            for (int j = i; j != 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        } */


        // Q2 - Program to sum 1st n (say, 4) even numbers using while loop. 0+2+4+6 = 12
//        int sum = 0;
//        int n = 4;
//        int i = 0;
//        while (i<n) {
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println( "Sum of 1st four even numbers = "  + sum);

        // Q3 - Program to print multiplication table of a given number n (say, 9).
//        int n = 9;
//        int t, j;
//        int i = 1;
//        while (i<=10) {
//            t = (n*i);
//            //j = i;
//            System.out.println("9 * " + i + " = " + t);
//            i++;
//        }

        // Q4 - Program to print multiplication table of 10 in reverse order.

//        int i = 10;
//        int t;
//        for (int j = 10; j != 0; j--) {
//              t = (j*i);
//            System.out.println("10 * " + j + " = " + t);
//        System.out.printf("%d * %d = %d\n", j, i, j*i);
//        }

        // Q5 - Program to find the factorial of a given number using 'for' loop. e.g. 4! = 4 * 3 * 2 * 1 = 24
//        int n = 4;
//        int i = 1;
//        int factorial = 1;
//        while (i<=n) {
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        int n = 4;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}




