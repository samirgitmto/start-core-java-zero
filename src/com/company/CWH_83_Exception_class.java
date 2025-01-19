package com.company;
import java.util.Scanner;
// to throw an exception explicitly by the programmer.
class MyException extends Exception {
    @Override
    public String toString() {
//        return super.toString() + " I am toString()";
        return "I am toString()";
    }

    @Override
    public String getMessage() {
//        return super.getMessage() + " I am getMessage()";
        return "I am getMessage()";
    }
}

public class CWH_83_Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer - ");
        a = sc.nextInt();
        if (a < 99) {
            try {
//                throw new MyException();    // throw kw is used to throw an exception explicitly by the programmer.
                throw new ArithmeticException("arithmetic exception");          // whatever exception we provide here to throw, will be thrown.
//                throw new ArrayIndexOutOfBoundsException("array exception");
            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();       // gives error output in red but is not an error. kon sa error kon si line me aaya h
                System.out.println("finished");
            }
            System.out.println("finally finished");
        }
    }
}
