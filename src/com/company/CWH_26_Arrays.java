package com.company;

public class CWH_26_Arrays {
    public static void main(String[] args) {
        System.out.println("Using 'arrays'");
        /*   Array is an object, or a collection of similar type of data. Use Case: Storing marks of 10 students.
          int [] marks = new int [5];      index starts from 0 and index 5 will be out of bounds
                reference    object
               declaration    memory allocation
        # Class of 500 students - We have to store marks of these 500 students.
        There are 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
          */

//        int [] marks = new int[5];
//        marks[0] = 90;        //index always starts from 0
//        marks[1] = 87;
//        marks[2] = 82;
//        marks[3] = 67;
//        marks[4] = 97;
//        marks[4] = 77; //marks overwritten. will always give the last as correct marks.
//        System.out.println(marks[4]);

        /*
        There are 3 ways to create arrays
        1.  int [] marks;           -> declaration
            marks = new int[5];     -> memory allocation

        2.  int [] marks = new int[5];

        3.  int [] marks = {90, 87, 81, 77, 67}   -> declare + initialize

        Arrays indices start from 0 and goes till (n-1), where n is the size of the array
         */

        int [] marks = {85, 86, 77, 66, 90};
        System.out.println(marks[4]);
        System.out.println(marks.length);  //to find the length (size) of the array
    }
}
