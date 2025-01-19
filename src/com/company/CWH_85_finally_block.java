package com.company;

public class CWH_85_finally_block {
    public static int greet() {         // p1
        try {
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {                 // execute whatever the case may be.
            System.out.println("Cleaning up resources.....end of the method");
        }
        return 0;        // default return for int greet method
    }
    public static void main(String[] args) {
        int k = greet();               // p1
        System.out.println(k);

        int a = 8, b = 4;                //see this one only    // p2
        while (true) {
            try {             // with try, catch or finally is a must.
                System.out.println("8 / b = " + a/b);
            }
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {    // even when 'break' is executed, finally has be executed
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
    }
}
