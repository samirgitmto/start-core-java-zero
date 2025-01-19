package com.company;

class BaseA {
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting x nos");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a Constructor");
    }
}

class DerivedB extends BaseA {                  // 'extends' keyword for Inheritance
    public int y;                            // inheritance can be employed using one base class only in JAVA.

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH_45_Inheritance {
    public static void main(String[] args) {
        BaseA a = new BaseA();           // base class object
        a.setX(4);
        System.out.println(a.getX());
        DerivedB b = new DerivedB();     // derived class object
        b.setX(5);                       // in addition to int y, int x is also available for the derived class from the base class.
        System.out.println(b.getX());    // all the variables of the base class are available in the derived class.
        b.setY(45);
        System.out.println(b.getY());
    }
}
