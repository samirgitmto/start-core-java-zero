package com.company;

public class CWH_28_Arrays_multidimensional {
    public static void main(String[] args) {
        System.out.println("multidimensional arrays - each element of an array is an array itself");
    // int [] students;       -> 1-D array
    // int [][] flats;        -> 2-D array
        int [][] flats;
        flats = new int [2][3];    // 2 rows & 3 columns
        flats [0][0] = 101;        // rows: 1 for ground floor & 2 for 1st floor
        flats [0][1] = 102;
        flats [0][2] = 103;
        flats [1][0] = 201;        // columns: ending with 1, 2, 3 represents flats number
        flats [1][1] = 202;
        flats [1][2] = 203;
        System.out.println(flats[0][2]);  //will read 003 as 3 simply

        System.out.println("printing a 2-D array using 'for' loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("2 'for' loops for 2 rows");
    }
}
