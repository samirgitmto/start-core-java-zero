package com.company;

public class CWH_23_for_loop {
    public static void main(String[] args) {
        System.out.println("Running for loop");
        for (int i=1; i<=5; i++) {
            System.out.print(i+" ");
        }

        // Print first n odd numbers. assume n = 5
        System.out.println("\nPrint first n odd numbers. assume n = 5");
        int n = 5;
        for (int j=0; j<=n-1; j++) {
            System.out.print(2*j + 1 + " ");
        }

        // Decrementing for loop
        System.out.println("\n \nDecrementing for loop");
        for (int k=4; k!=0; k--) {  //k!=0 Logical NOT is used here
            System.out.print(k + " ");
        }
    }
}
