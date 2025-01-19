package com.company;

public class CWH_17_Logical {
    public static void main(String[] args) {
        // && -> AND         // || -> OR         // !  -> NOT
        System.out.println("for Logical AND...");
        /*
        boolean a = true;
        boolean b = true;
        if (a && b) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        } */

        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a && b && c) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }

        System.out.println("for Logical OR...");
        boolean a1 = true;
        boolean b1 = false;
        boolean c1 = true;
        if (a1 || b1 || c1) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("for Logical NOT...");
        //reverse the output
        boolean a2 = true;
        boolean b2 = false;
        System.out.println("NOT(a2) is");
        System.out.println(!a2);
        System.out.println("NOT(b2) is");
        System.out.println(!b2);
        }
    }

