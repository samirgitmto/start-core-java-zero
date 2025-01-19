package com.company;

public class CWH_80_try_catch {
    public static void main(String[] args) {
        int a = 500;
        int b = 0;
////        without try -- it will directly give error and won't run the succeeding part of the program
//        int c = a / b;
//        System.out.println("result is " + c);

        // with try: saves from unexpected exception. Rather than giving error, it will highlight the error and also run the succeeding part of the program.
        try {
            int c = a / b;
            System.out.println("result is " + c); // if no logical error exists i.e. b = 10, then it will simply run the code, except for the catch part.
        }
        catch(Exception e) {              // this argument can be anything, e or f.
            System.out.println("Invalid. reason");
            System.out.println(e);
        }
        System.out.println("end of the program");
    }
}
