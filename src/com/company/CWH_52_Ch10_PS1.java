package com.company;

class Circle {
    public int radius;                        // attribute

    Circle (int r) {
        System.out.println("I am parameterised constructor of Circle super class with radius of " + r);
        this.radius = r;
    }
    public double area() {                     // method
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder extends Circle {
    public int height;
    Cylinder (int r, int h) {
        super(r);
        System.out.println("I am parameterised constructor of Cylinder sub class with radius of " + r);
        this.height = h;
    }

    public double volume() {
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class CWH_52_Ch10_PS1 {
    public static void main(String[] args) {
        // P1: Create a class Circle and use inheritance to create another class Cylinder from it.
        Circle objci = new Circle(2);
        Cylinder objcy = new Cylinder(3, 5);
    }
}
