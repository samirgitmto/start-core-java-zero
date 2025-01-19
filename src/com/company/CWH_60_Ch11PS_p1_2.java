package com.company;

abstract class Pen {       // p1
    abstract void writeWords();              // abstract methods can NOT have a body.

    void refillInk () {                           // however methods in an abstract class can have body
        System.out.println("refilling ....");
    }
}

class FountainPen extends Pen {
    void writeWords() {                               //In SubClass; abstract methods need to be defined again with the body, while general methods will be directly inherited.
        System.out.println("Writing ....");
    }
    void changeNib() {
        System.out.println("changing the nib ....");
    }
}

public class CWH_60_Ch11PS_p1_2 {
    public static void main(String[] args) {
        //p1: Create an abstract Pen with methods writeWords() and refillInk() as abstract methods.
        //p2: Use the class Pen from p1 to create a concrete class FountainPen with additional method changeNib().
        FountainPen fp = new FountainPen();
        fp.writeWords();        // abstract method in super class called after defining its body in the SubClass.
        fp.refillInk();         // normal method in super abstract class called directly by SubClass.
        Pen fp2 = new FountainPen();        // abstract methods can be referenced, however it can not be instantiated.
        fp2.refillInk();
//        fp2.changeNib();        -- error: reference is Superclass, while method is of Subclass. Not allowed
    }
}
