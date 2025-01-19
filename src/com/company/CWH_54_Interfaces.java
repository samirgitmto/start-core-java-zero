package com.company;

interface Bicycle {
    int a = 45;                       // property: Can create properties in interfaces, but it can NOT be modified as it is always final.
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class Avon implements Bicycle {
    void blowhorn() {
        System.out.println("honking");
    }
    public void applyBrake(int decrement) {            // methods in interface must be defined in its implemented class and must be public.
        System.out.println("Applying brake");
    }            //must be PUBLIC, bcoz same method in Super class is PUBLIC as fields inside interfaces are always PUBLIC.
    public void speedUp(int increment) {
        System.out.println("Applying speedup");
    }
}

public class CWH_54_Interfaces {          // Interface is a point where two systems meet and interact. In JAVA, it is a group of related methods with empty bodies.
    public static void main(String[] args) {
        Avon cycleharry = new Avon();
        cycleharry.applyBrake(1);
        System.out.println(cycleharry.a);
//        cycleharry.a = 47;     // -- error: no modification possible
    }
}
