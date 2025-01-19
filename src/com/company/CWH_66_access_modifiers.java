package com.company;

class C1{
    public int x = 5;
    protected int y = 10;
    int z = 15;                         // default field when nothing is mentioned
    private int a = 20;
    public void meth1() {
        System.out.println(x);              // everything can be accessed within the same class
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class CWH_66_access_modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        c.meth1();
        System.out.println(c.x);         // property can be called in 2 ways; either by creating object; or by directly using sout.
        System.out.println(c.y);         // public, protected and default fields can be accessed withing the same package.
        System.out.println(c.z);
//        System.out.println(c.a);       -- error: a is private. so it can't be accessed even within the same package

    }
}
