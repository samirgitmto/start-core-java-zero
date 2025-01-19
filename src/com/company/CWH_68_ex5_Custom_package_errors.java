package com.company;

/*  *** Write this code in Notepad ***
Create a package named com.codewithharry.shape, having individual classes for rectangle, square, circle, cylinder, sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area and getters/setters for dimensions. */
class Shape {
    int radius;
    int length;
    int breadth;
    int height;

    Shape (int r, int l, int b, int h) {              // constructor
        System.out.println("parameterised constructor of class Shape");
        this.radius = r;
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public Shape() {
        System.out.println("non parameterised constructor of class Shape");
    }

    public int getRadius() {
        System.out.print("radius = ");
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getLength() {
        System.out.print("length = ");
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        System.out.print("breadth = ");
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        System.out.print("height = ");
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(-1, length, breadth, -1);            // -1 means this parameter is not valid here
    }
    public double rectsa() {
        System.out.println("lenght of rectangle = " + length + "; breadth of rectangle = " + breadth);
        double rsa = length*breadth;
        System.out.println("surface area of rectangle = " + rsa);
        return rsa;
    }
}

class CircleCI extends Shape {
    CircleCI (int radius) {
        super(radius, -1, -1, -1);              // -1 means this parameter is not valid here
    }
    public double cirsa() {
        System.out.print("radius of circle = " + radius);
        double csa = Math.PI*radius*radius;
        System.out.print("area of circle = ");
        return csa;
    }
}

class CylinderCY extends Shape {
    CylinderCY(int radius, int height) {
        super(radius, -1, -1, height);
    }
    public double cylsa() {
        System.out.println("radius of cylinder = " + radius + "; height of cylinder = " + height);
        double cysa = 2*Math.PI*radius*radius + 2*3.142*radius*height;
        System.out.print("surface area of cylinder = ");
        return cysa;
    }
    public double cylvol() {
        System.out.println("radius of cylinder = " + radius + "; height of cylinder = " + height);
        double cyv = Math.PI*radius*radius*height;
        System.out.print("volume of cylinder = " + cyv);
        return cyv;
    }
}

public class CWH_68_ex5_Custom_package_errors {
    public static void main(String[] args) {
//        Shape ar = new Shape(2, 3, 4, 5);
//        System.out.println(ar.breadth);
//        ar.setLength(5);
//        ar.setBreadth(43);
//        ar.setHeight(3);
//        ar.setRadius(1);
//        System.out.println(ar.breadth);
//        System.out.println(ar.cylsa());     -- error
        Rectangle rcm = new Rectangle(1, 2);
        rcm.rectsa();

        CylinderCY cy = new CylinderCY(2, 5);
        cy.cylsa();
        cy.cylvol();


//        ar.setRadius(5);
//        System.out.println(ar.getRadius());
//        ar.setLength(8);
//        System.out.println(ar.getLength());

    }
}
