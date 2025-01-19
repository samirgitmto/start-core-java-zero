package com.company;

class Phone {
    public void ringtone() {
        System.out.println("ringing a tone...");
    }
    public void name() {
        System.out.println("My name is Nokia");
    }
}

class Smartphone extends Phone {
    public void music() {
        System.out.println("playing a song...");
    }
    public void name () {
        System.out.println("My name is Samsung");
    }
}

public class CWH_49_Dynamic_Method_Dispatch {     // Super_Sub allowed: means Phone_Smartphone; object of Smartphone, can be referenced as Phone in real world.
    public static void main(String[] args) {      // however, reference matters
        Phone obj = new Smartphone();   // allowed: reference of Parent class can equals to object of Child class
//      reference   = object of child class;   object matters, not the reference. *Object is always created during the runtime.
        obj.name();
        obj.ringtone();     // allowed: bcoz reference is of Phone (Super class)
//        obj.music;      // NOT allowed: obviously simple phones can't play music
//      Smartphone smobj = new Phone();        // NOT allowed: reference of child class can not equals to object of parent class
    }
}
