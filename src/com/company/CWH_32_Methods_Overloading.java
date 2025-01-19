package com.company;

public class CWH_32_Methods_Overloading {
    //1. about method call
//    static void change(int a) {
//        a = 98;
//    }
//    static void change2(int [] arr) {
//        arr [0] = 98;
//    }
//    static void tellajoke() {     //#void used when we don't want our method to return anything. We use 'void' as the return type. eg In CWH31, we used 'int' as the return type
//        System.out.println("I invented a new word!\n" + "Plagiarism");
//        return;
//    }
    //2. Methods Overloading
    static void foo() {    //changing 'return' type won't allow method overloading. Parameters have to be changed.
        System.out.println("Good morning");
    }
    static void foo(int a) {        //-> 'a' is a "parameter"
        System.out.println("Good morning " + a);
    }
    static void foo(int a, int b) {        //-> 'a' & 'b' are "parameters"
        System.out.println("Good morning " + a);
        System.out.println("Good morning " + b);
    }


    public static void main(String[] args) {

        //2. Methods Overloading
    /*    Two or more methods can have same name but different parameters. Such methods are called Overloaded methods.
          Method overloading can't be performed by changing the 'return' type of methods. */
        foo();
        foo(3000);             //-> '3000' is an "argument"
        foo(3000, 400);      //-> '300' & '400' are "arguments"
        // Arguments are Actual
        System.out.println("Arguments are Actual");

        //1. about method call
//        tellajoke();
        /* #by using 'static', we can directly call method 'tellajoke' by all the objects inside the class 'CWH_32_Methods_Overloading'. That's why object name is not required
            to call the method 'tellajoke'. */

//        //Case 1: Changing the integer (won't be changed)
//        int x = 45;
//        change(x);
//        System.out.println("Value of 'x' after running change is: " + x);
//        // This result will be different in case of array
//
//
//        //Case 2: Changing the array  (will be changed)
//        int [] marks = {79, 89, 67, 48, 93};  //int [] marks is an "Array Object" in which 'marks' is a "reference"
//        change2(marks);
//        System.out.println("Value of element at index 0 after running change is: " + marks[0]);
        //Note the changed value. Since address (reference) of array object has been passed to 'change2' "function".
        // that's why same object i.e. element at index0 is changed.
        // In case of Arrays, the reference is passed. Same is the case for object passing to methods.



    }
}

