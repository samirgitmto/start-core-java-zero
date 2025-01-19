package com.company;
import java.util.Scanner;

public class CWH_81_handle_specificExceptions {
    public static void main(String[] args) {
        int [] marks = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();

        System.out.println("Enter the no. you want to divide the value with ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[index]);
            System.out.println("The value at array-value/number is: " + marks[index]/number);
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);         // this will give the Arithemetic exception.
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);         // this will give the Array bound exception.
        }

        catch (Exception e) {
            System.out.println("Some other exception occured!");
            System.out.println(e);         // this will give the exception occured
        }

    }
}
