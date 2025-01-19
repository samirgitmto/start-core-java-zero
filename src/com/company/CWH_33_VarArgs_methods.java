package com.company;

public class CWH_33_VarArgs_methods {          //Variables Arguments
        //multiple operations(methods) on same variables
//        static int sum(int ...arr) {
//            // available as int [] arr;
//            int result = 0;
//            for (int a: arr) {
//                result += a;
//            }
//            return result;
//        }
        static int sum(int x, int ...arr) {
            //(int x) above means at least there must be 1 value. That's why "nothing" does not work out
            // available as int [] arr;
            int result = x;
            for (int a: arr) {    // a represents "e" or "element"
                result += a;
            }
            return result;
        }
    public static void main(String[] args) {
        System.out.println(" VarArgs tutorial");
//        System.out.println("The sum of nothing is: " + sum());
        System.out.println("The sum of 1 is: " + sum(1));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(4, 3, 5));
        System.out.println("The sum of 414, 803, 50 and 5 is: " + sum(414, 803, 50, 5));
    }
}


