package com.company;
import java.util.Scanner;
import java.util.*;

public class ACCIOJOB3W {
    public static void main(String[] args) {
        /*  Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line.
          Input Format
           The first line contains an integer, N, the size of the array. The second line contains N space-separated integers of the array.
          Output Format
           Print the following 3 lines, each to decimals (use double in java):
            proportion of positive values
            proportion of negative values
            proportion of zeros                    */
//        int [] integers = {-4, 3, -9, -5, 4, 1};
////        System.out.println(integers.length);
//        int l = integers.length;
        Scanner sc = new Scanner(System.in);
//        int l = sc.nextInt();
//        int [] integers = new int[l];
//        int a, b, c, d, e, f;
////        int a= sc.nextInt(), b = sc.nextInt();
//////        int b = sc.nextInt();
////        int c = sc.nextInt();
////        int d = sc.nextInt();
////        int e = sc.nextInt();
////        int f = sc.nextInt();
////        integers[] = sc.nextInt();
////        integers = sc.nextLine().split(" ");
////        a = Integer.parseInt(integers[0]);
////        b = integers [1];
////        c = integers [2];
////        d = integers [3];
////        e = integers [4];
////        f = integers [5];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        float count_pos=0;
//        float count_neg=0;
//        float count_zero=0;
////        int positive = 0;
////        int negative = 0;
//        //int negative = 0; NegativeNum(array, out negative);
//        while(i < l) {
//            if(integers[i] > 0) {
//                count_pos++;
//            }
//            i++;
//        }
//        System.out.println(count_pos);
//        System.out.println(count_pos/l);
//
//        while (j<l) {
//            if (integers[j]<0) {
//                count_neg++;
//            }
//            j++;
//        }
//        System.out.println(count_neg);
//        System.out.println(count_neg/l);
//
//        while (k<l) {
//            if (integers[k] == 0) {
//                count_zero++;
//            }
//            k++;
//        }
//        System.out.println(count_zero);
//        System.out.println(count_zero/l);


//        for (i = 0; i<l-1; i++) {
//            if (integers[i] > 0) {
//                positive += positive;
//            }
//            else if (integers[i] < 0) {
//                negative++;
//            }
       // }
//        System.out.println(positive);
//        System.out.println("Armstrong number");
//        int N, temp, remainder, dgc = 0;
//        Scanner sc = new Scanner(System.in);
//        N = sc.nextInt();
//        temp = N;
//        while (temp>0) {
//            remainder = temp % 10;
//            dgc += Math.pow(remainder, 3);
//            temp /= 10;
//        }
//        System.out.println(dgc);
//
//        if (dgc == N) {
//            System.out.println("1");
//        }
//        else {
//            System.out.println("0");
//        }

//        System.out.println("Staircase");
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        for(int i=1; i<=N; i++) {
//            for (int j = 1; j <= N - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i; k++) {
//                System.out.print("#");
//            }
//            System.out.println();
//        }
        System.out.println("java program to take multiple input from user on single line with spaces");
        String s = sc.nextLine();
        String [] str = s.split("");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int z = Integer.parseInt(str[2]);
        System.out.println(x + " " + y + " " + " " + z);
    }
}
