package com.company;

class MyException84 extends Exception {              //the Custom Exception
    @Override
    public String toString() {
        return "radius can't be negative";
    }
}
public class CWH_84_throw_vs_throws {
    public static double circle_area(int r) throws MyException84{   // to check any exceptions here, we will create a Custom Exception here.
        if (r<0) {
            throw new MyException84();
        }
        double result = Math.PI * r *r;
        return result;
    }
    //1. method created by Harry
    public static int divide (int a, int b) throws ArithmeticException {   // Harry transferred exception's responsibilities to Samir.
        int result = a/b;                                                     //That means Samir has to be prepared with try catch block.
        return result;
    }
    public static void main(String[] args) {                    // method signature
        //1. Samir - uses divide method created by Harry
        try {
//            int c = divide(6, 0);
//            System.out.println(c);
            double result = circle_area(-6);                 //finally using try catch block, it will run
            System.out.println(result);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        // circle area
//        double result = circle_area(6);              // already giving warning about the Exception defined in the method
    }
}
