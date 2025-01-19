package com.company;

/*  *** Write this code in Notepad ***
Create a package named codewithharry.shape, having individual classes for rectangle, square, circle, cylinder, sphere
These classes should use inheritance to properly manage the code!
Include methods like volume, surface area and getters/setters for dimensions. */
class Shape68 {
    int radius;
    int length;
    int breadth;
    int height;

    Shape68(int r, int l, int b, int h) {              // constructor
        this.radius = r;
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    public Shape68() {
        System.out.println("non parameterised constructor of class Shape");
    }






}

class Rectangle68 extends Shape68 {
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

    Rectangle68(int l, int b) {              // constructor
        super();
        this.length = l;
        this.breadth = b;
    }
    public double rect_sa() {
        System.out.println("lenght of rectangle = " + length + "\n breadth of rectangle = " + breadth);
        System.out.print("surface area of rectangle = ");
        return length*breadth;
    }
}

class Circle68 extends Shape68 {
    public int getRadius() {
        System.out.print("radius = ");
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public Circle68(int r, int l, int b, int h) {
        super(r, l, b, h);
        this.radius = r;
    }

    public double cir_sa() {
        System.out.print("area of circle = ");
        return Math.PI*radius*radius;
    }
}

class Cylinder68 extends Shape68 {
    public double cyl_sa() {
        System.out.print("surface area of cylinder = ");
        return 2*Math.PI*radius*radius + 2*3.142*radius*height;
    }
    public double cyl_vol() {
        System.out.print("volume of cylinder = ");
        return Math.PI*radius*radius*height;
    }
}

public class CWH_68_ex5_Custom_package {
    public static void main(String[] args) {
        Circle68 c68 = new Circle68(2, 5, 6, 8);
        c68.setRadius(5);
        System.out.println(c68.getRadius());
        c68.cir_sa();
    }
}
