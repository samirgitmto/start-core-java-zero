package com.company;

class Base2 {
    Base2() {
        System.out.println("I am a Constructor");
    }
    Base2(int x) {
        System.out.println("I am an overloaded Constructor with the value of a as: " + x);
    }
}

class Derived2 extends Base2 {
    Derived2() {
        super(15);                                                // 'super' kw to call the parametrised constructor of the above order class.
        System.out.println("I am a derived class Constructor");
    }
    Derived2(int x, int y) {
        super(x);                // After introducing super, note that the parametrised constructor of its parent class will be called upon using the main function argument.                                   // since no super argument here, that's why Non-Parametrised Constructor will be called upon by default.
        System.out.println("I am a derived class overloaded constructor with value of y as: " + y);
    }
}

class ChildofDerived2 extends Derived2 {
    ChildofDerived2() {
        System.out.println("I am a Constructor of child of Derived2");
    }
    ChildofDerived2(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded Constructor of child of Derived2 with value of y as: " + y);
    }
}
public class CWH_46II_Part2 {
    public static void main(String[] args) {
//        Derived2 dd = new Derived2(10, 5);
        ChildofDerived2 cd = new ChildofDerived2(2, 3, 4);
    }
}
