package com.company;

public class CWH_31_Ch7_Methods {
    static int logic(int x, int y) {     // DRY principle - don't repeat yourself
        int z;
        if (x>y) {
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        x = 566;        // does not effect the copy's values
        return z;
    }
    public static void main(String[] args) {
        System.out.println("Using 'method' to avoid repeat of codes to run the same code");

        int a = 7;
        int b = 5;
        int c;
        // method invocation using object creation. (when static is not used).
//        CWH_31_Ch7_Methods obj = new CWH_31_Ch7_Methods(); //Object creation
//        c = obj.logic(a, b);                               //method call upon an object   //if static is not used, then we have to create an object to run the code
        c = logic(a, b);              //require static method to call the above logic directly without creating an object
        System.out.println(c);

        int a1 = 1;
        int b1 = 5;
        int c1;
//        c1 = obj.logic(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c1);
    }
}
