package com.company;

class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v) {
        this.a = v;          // 'this' kw is simply a reference.
    }
    public int returnone() {
        return 1;
    }
}

class DoClass extends EkClass{
    DoClass(int c) {
        super(c);
        System.out.println("I am a constructor");
    }
}

public class CWH_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(4);
        System.out.println(e.getA());
        DoClass f = new DoClass(5);
    }
}
