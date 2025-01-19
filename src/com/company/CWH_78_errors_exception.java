package com.company;

import java.util.Scanner;

public class CWH_78_errors_exception {    // 1. Syntax error    2. Logical error   3. Runtime error
    public static void main(String[] args) {
        // 1. Syntax error demo
//        int a = 5           -- No semicolon: Syntax error
//        d = 4;              -- Variable not declared: Syntax error
//        System.out.println(a);
/*   IDE can suggest solutions for Syntax errors */

        // 2. Logical error demo
//        print all prime numbers between 1 to 10.
        System.out.println(2);
        for (int i=1; i<5; i++) {
            System.out.println(2*i + 1);
        }   // result: 2, 3, 5, 7, 9  -- 9 is not a prime no. Thus, its a logical error
/*   IDE can not suggest solutions for Logical errors */

        // 3. Runtime error
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + 1000/k);
//      if k = 0; Exception in thread "main" java.lang.ArithmeticException: / by zero at com.company.CWH_78_errors_exception.main(CWH_78_errors_exception.java:25)
//      This is because any integer divided by 0 is not defined in Java.
    }
}
