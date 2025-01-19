package com.company;

class Square {
    int length;                  // attributes
    int breadth;

    Square (int l, int b) {
        System.out.println("Parameterised Constructor of superclass Square with l = " + l + " and b = " + b);
        this.length = l;
        this.breadth = b;
    }

    public double surfaceArea () {               // method
        System.out.print("Surface area of Square = ");
        return this.length*this.breadth;
    }
}

class Cuboid extends Square {
    int height;
    double sa;

    Cuboid (int l, int b, int h) {
        super(l, b);
        this.height = h;                         // dynamic initialization is a must. len and bre not required here as they are present in Superclass.
        System.out.println("Parameterised Constructor of subclass Cuboid with length = " + l + " , breadth = " + b + " and height = " + h);
    }

    public double surfaceArea () {
        System.out.print("Surface area of Cuboid = ");
        sa = 2*(this.length*this.breadth + this.length*this.height + this.height*this.breadth);
        return sa;
    }
}


public class CWH_52_Ch10_PS2 {
    public static void main(String[] args) {                             // Square superclass with Cuboid subclass
        Cuboid cb = new Cuboid(6, 3, 2);
        System.out.println(cb.surfaceArea());
//        Square sq = new Square(3, 4);
//        System.out.println(sq.surfaceArea());

//        Square s = new Cuboid(10, 9, 8);
//        System.out.println(s.surfaceArea());
    }
}
