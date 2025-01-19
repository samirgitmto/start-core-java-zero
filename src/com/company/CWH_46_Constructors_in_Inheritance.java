package com.company;

class Base {
    Base() {
        System.out.println("I am a Constructor");
    }
    Base(int x) {
        System.out.println("I am an overloaded Constructor with the value of a as: " + x);
    }
}

class Derived extends Base {
    Derived() {
        super(15);       // 'super' kw to call the constructor with argument. super to give argument.  // this constructor NOT called as 2 arguments given and thus the
        System.out.println("I am a derived class Constructor");          // super invalidated                //   base class constructor with no argument will be called upon.
    }
    Derived(int x, int y) {
        super(x);                   // since variable x is placed, it will take up the x value from the arguments given in the derived class object arguments
        System.out.println("I am a derived class overloaded constructor with value of y as: " + y);
    }
}
public class CWH_46_Constructors_in_Inheritance {
    public static void main(String[] args) {
//        Base bb = new Base();
//        Derived dd = new Derived(); // will call constructor of the base class. Priority will be given to base class constructor.
        Derived dd = new Derived(10, 5);   // 2 arguments given in main function, so derived class constructor with 2 parameters will be called upon.
    }                                             // these arguments only valid for derived class. Arguments in 'super' kw will be called in the base class.
}                                         // however, if we place the same variable x in super kw, then only this x value will be called in the base class.
// 1st derived class called this constructor due to arguments, & then 'super' kw called the base class parameterised constructor.