package com.company;
import java.util.Scanner;
// repeating the program to take inputs as longer as we don't get the  valid input.
public class CWH_82_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = {1, 56, 7};
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Enter the array index ");
            int ind = sc.nextInt();
            System.out.print("Enter any number to divide the array element ");
            int num = sc.nextInt();

            try {
//                System.out.println("The value at array index entered is: " + marks[ind]);
//                System.out.println("The value of array-value/number is: " + marks[ind] / num);
                try {
                    System.out.println("The value at array index entered is: " + marks[ind]);
                    System.out.println("The value of array-value/number is: " + marks[ind] / num);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {                     // this is inner catch. means it will try to settle the case on his own.
                    System.out.println("Sorry! this index does not exist");    // ArrayIndexOutOfBoundsException catches invalid index, but it couldn't catch Arithmetic exception.
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {                                          // outer/main one.
                System.out.println("Exception in level 1");
                System.out.println(e);
            }
        }
        System.out.println("Thanks for using this program");
    }
}

