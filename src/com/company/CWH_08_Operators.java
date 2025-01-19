package com.company;

public class CWH_08_Operators {
    public static void main(String[] args) {
        //Arithmetic operators can't work with boolean operator
        //1. Arithmetic Operators
        int a = 4;
        int b = 4 % a; //Modulo Operator - will provide remainder
        System.out.println(b);
        float b2 = 8.2f % a; //Return decimal remainder
        System.out.println(b2);

        //2. Assisgnment Operators
        int c = 3;
        c *= 3; //means get the value of b times 3

        //3. Comparison Operators
        System.out.println(8==6); //to compare
        System.out.println(8>6);

        //4. Logical Operators
        System.out.println(44>5 && 33>2); //both must be true
        System.out.println(44>5 || 33<2); //OR operator

        //5. Bitwise Operator
        System.out.println(2&3);
    }
}
