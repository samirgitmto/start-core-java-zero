package com.company;

interface Cycle {
    int a1 = 50;                    //final property: can't be modified. Major difference b/w Class and interface
    void brakeIt(int decrement);      // methods
    void acclIt(int increment);
}
interface HornCycle {
    int a2 = 55;
    public void blowHornK3G();    // interfaces methods are public by default.
    void blowHornMHN();          // methods
}

class Ranger implements Cycle, HornCycle {
//    int a1 = 50;    // property fields defined in interfaces do NOT require repetition unlike methods defined in interfaces.
    void blowHorn (){
        System.out.println("horn...");
    }
    public void brakeIt (int decrement) {            // methods in interface must be defined in its implemented class and must be public.
        System.out.println("applying the brake");
    }
    public void acclIt (int increment) {
        System.out.println("speeding up");
    }
    public void blowHornK3G() {
        System.out.println("Kabhi Khushi Kabhi Gham ....");
    }
    public void blowHornMHN() {
        System.out.println("Main hoon naa ....");
    }
}

public class CWH_55_interface2 {
    public static void main(String[] args) {
       Ranger rr = new Ranger();            // Object of interfaces can't be created, however references of interfaces can be created.
       rr.acclIt(1);
       System.out.println(rr.a1);
       System.out.println(rr.a2);
       rr.blowHornMHN();

    }
}
