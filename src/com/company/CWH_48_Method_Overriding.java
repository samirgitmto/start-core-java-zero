package com.company;

class A {
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){                     // meth2 again used in child class
        System.out.println("I am method 2 of class A");
    }
}
class B extends A {
    @Override            // annotation to depict method overriding. recommended to use.
    public void meth2(){                      // this is 'method overriding'. Same method name, but different parameters
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class CWH_48_Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
//        b.meth2();     //since B is child class of A, so it will execute meth2 of class A
        b.meth2();       // After method overriding, it will execute meth2 of Class B
    }
}
