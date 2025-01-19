package com.company;

import java.util.Scanner;

public class CWH_12_Practice_Set_Q1_Q3 {
    public static void main(String[] args) {
        //Q1 - What will be the result of expression: float a = 7/4*9/2
        /*Q2 - Write a java program to encrypt a grade by adding 8 to it.
               Decrypt it to show the correct grade.
         */
        //Q3 - Use Comparison Operators to find out whether a given number is greater than the user entered number or not.

        float a = 7/4 * 9/2; //Answer shown is 4. Wrong because we are doing on integers
        System.out.println(a);
        float b = 7/4.0f*9/2.0f;
        System.out.println(b); //Importance of float

        /*
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        grade = (char)(grade - 8);  //Decrypting the grade
        System.out.println(grade);
        */

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i>8);


    }
}
