package com.company;

interface samlpleInterface {
    void meth1();
    void meth2();
}

//class childsampleInterface extends samlpleInterface {}   -- error: NOT allowed
//class childsampleInterface implements samlpleInterface{}   // Allowed
//interface childsampleInterface extends samlpleInterface{}    // Allowed

interface childsampleInterface extends samlpleInterface {    // Inheritance
    void meth3();
    void meth4();
}

class mySampleClass implements childsampleInterface {         // implementation
    public void meth1() {
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
}

public class CWH_58_Inheritence_inInterfaces {
    public static void main(String[] args) {
        mySampleClass obj = new mySampleClass();
        obj.meth1();
    }
}
