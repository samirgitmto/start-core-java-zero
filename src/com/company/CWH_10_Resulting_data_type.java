package com.company;

public class CWH_10_Resulting_data_type {
    public static void main(String[] args) {
//        byte x = 5;
//        int y = 45 + 4;
//        short z = 8;
//        int a = y + z;
//        float b = 16.66f + 6;
//        System.out.println(a);
//        System.out.println(b);

        /* Increment and Decrement Operators
        int i = 56;
        System.out.println(i++); // first i is assigned value of 56, then i is incremented
        System.out.println(i);   // i incremented
        System.out.println(++i); // first i is incremented, then it is printed(assigned +1 value)
        System.out.println(i);   // simply i printed
        */
        // Que - int y = 7; int x = ++y+8; Value of x = ?
        int y = 7;
        System.out.print("Value of x = ");
        System.out.println(++y * 8);
        char ch = 'a';
        System.out.println(++ch);
    }
}
