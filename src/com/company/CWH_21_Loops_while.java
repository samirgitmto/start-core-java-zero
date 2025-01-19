package com.company;

public class CWH_21_Loops_while {
    public static void main(String[] args) {
      // LOOPS used for something to print repeatedly
      // 3 types: While loop; do-while loop; for loop

        System.out.println("Using Loops");
        int i = 1;
        while (i<=3) {
            System.out.println(i);
            i++;
        }
        System.out.println("finished running while loop");

        /* will run infinitely
        while (true) {          // sort of boolean expression using (true)
            System.out.println("I am an infinite while loop");
        } */

        int n = 100;
        while (n<=200) {
            System.out.print(n + " ");
            n++;
        }

        int x=0;
        ++x;
        System.out.println("\n"+x);
//        x++;

    }
}
