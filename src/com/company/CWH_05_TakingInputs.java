package com.company;
import java.util.Scanner;

public class CWH_05_TakingInputs {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the user");
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number 1");
//        //int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("enter number 2");
//        //int b = sc.nextInt();
//        float b = sc.nextFloat();
//        //int sum = a + b;
//        float sum = a + b;
//        System.out.println("the sum of these numbers is");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();  //to check validity
//        System.out.println(b1);
//        String str = sc.next();     //only for single word
        String str = sc.nextLine();   //for multiple words
        System.out.println(str);
    }
}
