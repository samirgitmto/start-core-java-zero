package com.company;

// p3
interface BasicAnimal {
    void eat();
    void sleep();
}
class Monkey {
    void jump() {
        System.out.println("jumping ....");
    }
    void bite() {
        System.out.println("biting ....");
    }
}
class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("eating ....");
    }
    public void sleep() {
        System.out.println("sleeping ....");
    }
}

//// p4
//abstract class Telephone {
//    abstract void ring();
//    abstract void disconnect();
//}
//class SmartTelephone extends Telephone {
//    public void ring() {
//        System.out.println("ringing .....");
//    }
//    public void disconnect() {
//        System.out.println("disconnecting .....");
//    }
//}
public class CWH_60ii_Ch11PS2 {
    public static void main(String[] args) {
//        p3: Create a class Monkey with jump() and bite() methods. Create another class Human which inherits this Monkey class and implements BasicAnimal interface with eat() and sleep() methods.
        Human hm = new Human();
        hm.bite();
        Monkey mn = new Human();       // sort of polymorphism
        mn.bite();

// p4: Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism.
//        SmartTelephone smtp = new SmartTelephone();
//        smtp.disconnect();
//        Telephone tp = new SmartTelephone();             // polymorphism
//        tp.disconnect();
    }
}
