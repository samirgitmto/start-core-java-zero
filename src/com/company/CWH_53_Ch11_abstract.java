package com.company;

abstract class Parent {                    // abstract class
    public Parent() {            // Constructor
        System.out.println("I am Parent Constructor");
    }
    public void sayHello() {               // method
        System.out.println("Hello");
    }                                    // abstract methods: Support both single line method(signature) and function/method with implementation
    abstract public void greet();        // abstract method need to be implemented by all subclasses but must be implemented in different ways.
    abstract public void greet2();       // An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon)
}
class Child extends Parent {           // When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class.
    @Override
    public void greet() {                       // Each non-abstract subclass of Parent, such as Child and Child2, must provide implementations for the greet and greet2 methods:
        System.out.println("Good Morning");
    }                     //must be PUBLIC, bcoz same method in Super class is PUBLIC.
    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}
abstract class Child2 extends Parent {         // implementation
    public void th() {
        System.out.println("I am good");
    }
}
public class CWH_53_Ch11_abstract {         // thought or idea without physical or concrete existence
    public static void main(String[] args) {
//        Parent p = new Parent();          // -- error: NOT possible to create an object of an abstract class // Possible to create reference of an abstract class.
        Child c = new Child();
//        Child2 c2 = new Child2();         // -- error: NOT possible to create an object of an abstract class
        Parent pp = new Child();      // Can assign reference of an abstract class to the object of a concrete class.
    }
}
