package com.company;

import java.util.Scanner;

public class CWH_29_Ch6_PracticeSet {
    public static void main(String[] args) {
        System.out.println("1. Create an array of 5 floats and calculate their sum");
//        System.out.println("solving Q1 using naive method");
//        float [] cpi = new float[5];
//        cpi [0] = 6.72f;
//        cpi [1] = 6.28f;
//        cpi [2] = 7.72f;
//        cpi [3] = 8.28f;
//        cpi [4] = 6.0f;
//        System.out.println(cpi[0] + cpi[1] + cpi[2] + cpi[3] + cpi[4]);

//        System.out.println("solving Q1 using 'for' loop method");
//        float [] cpi = {6.72f, 6.28f, 7.72f, 8.28f, 6.0f};
//        float sum = 0;
//        for (int i = 0; i < cpi.length; i++) {
//            sum = sum + cpi[i] + 0;
//        }
//        System.out.println(sum);

//        System.out.println("solving Q1 using 'while' loop method");
//        float [] cpi = {6.72f, 6.28f, 7.72f, 8.28f, 6.0f};
//        float sum = 0;
//        int i = 0;
//        while (i < cpi.length) {
//            sum = sum + cpi[i] + 0;
//            i++;
//        }
//        System.out.println(sum);


//        System.out.println("solving Q1 using 'do-while' loop method");
//        float [] cpi = {6.72f, 6.28f, 7.72f, 8.28f, 6.0f};
//        float sum = 0;
//        int i = 0;
//        do {
//            sum = sum + cpi[i] + 0;
//            i++;
//        } while (i < cpi.length);
//        System.out.println(sum);
//        //Q1 NOT completed here. Do it using for-each loop

        // Que - 2: Write a program to find out whether a given integer is present in an array or not.

//        System.out.println("2. Program to find out whether a given integer is present in an array or not.");
//        int [] marks = {67, 88, 97, 65, 68};
//        System.out.println("Enter the marks");
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        boolean isInArray = false;    //We initialize by assuming that it is not present
//        for (int element: marks) {
//            if (i == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("Yes! The entered marks is present in the array");
//        }
//        else {
//            System.out.println("Nope! The entered marks is not present in the array");
//        }

//        System.out.println("3. Average marks from an array containing marks of all students in Physics using for-each loop.");
//        int[] marks = {66, 88, 97, 65, 68};
//        int sum = 0;
//        int i = marks.length;
//        for (int element : marks) {
//            sum = sum + element;
//        }
//        System.out.println("The average marks is " + sum/i);

        /*     // Que 4
        System.out.println("4. Program to add two matrices of size 2 x 3.");
        int [][] mat1 = {{3, 5, 6},    //each matrices contain 2 arrays
                         {8, 9, 1}};
        int [][] mat2 = {{1, 15, 2},
                         {2, 1, 11}};
        int [][] result = {{0, 0, 0},
                         {0, 0, 0}};

        System.out.println("The resultant matrix will be");
//      Printing the elements of a 2-D Array
        for (int i=0; i<mat1.length; i++) {               //will run row number of times i.e. 2
            for (int j=0; j<mat1[i].length; j++) {        //will run column number of times i.e. 3
//                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];   //will add the corresponding column elements [i.e. {3, 5, 6} + {1, 15, 2}] for row 1 (whose index is 0)
                System.out.print(result[i][j] + " ");     //will print the sum of 1st row elements and display with a pace in between them
            }
            System.out.println("");                       //will go back to original 'for' loop after getting into the next line and run the above code in similar manner for row 2
        } */

//        // Que 5
//        System.out.println("5. Java Program to reverse an array");
////        System.out.println("print a greatest integer");
////        int a =  Math.floorDiv(5,2);      //print a greatest integer
////        System.out.println(a);
////        float b = Math.floorDiv(5, 2);    //print a greatest integer
////        System.out.println(b);            //both int and float will give same value
//        int [] arr = {1, 28, 3, 4, 50, 6, 88};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i=0; i<n; i++) {
//            // Logic to swap arr[i] and arr[l-i-1] using a temporary block ||
//            // |3| |4| ||  -> || |4| |3|  -> |4| || |3|  -> |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        System.out.print("{");
//        for (int element: arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println("}");

//        // Que 6
//        System.out.println("6. Program to find the maximum element in an array");
//        int [] arr = {50, 68, 89, 90, 35};
//        System.out.print("Given array: {");
//        for (int e: arr){
//            System.out.print(e+" ");
//        }
//        System.out.println("}");
//        int max = Integer.MIN_VALUE;  //for default minimum integer value in JAVA
//        for (int e: arr) {    //e means element
//            if (e>max) {
//               max = e;
//            }
//        }
//        System.out.println("\tMaximum element is " + max);
////        System.out.println(Integer.MIN_VALUE);
////        System.out.println(Integer.MAX_VALUE);
//
//        // Que 7
//        System.out.println("7. Program to find the minimum element in an array");
//        int min = Integer.MAX_VALUE;
//        for (int e: arr) {
//            if (e<min) {
//                min = e;
//            }
//        }
//        System.out.println("\tMinimum element is " + min);

        // Que 8
        System.out.println("8. Program to find whether an array is sorted(in increaing order) or not");
        int [] arr = {50, 68, 89, 90, 350};
        boolean isSorted = true;
        for (int i=0; i< arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
//        System.out.println(isSorted);
        if (isSorted) {
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }

    }
}
