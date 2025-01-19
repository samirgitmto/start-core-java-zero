package com.company;
// problem 1
class cylinder {                                // problem 1-3
    private int radius;
    private int height;

    public cylinder(int radius, int height) {    //problem 3: Constructor
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        System.out.println("radius: " + radius);   // notice the repeatability
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea() {
        return 2*Math.PI*radius*radius + 2*3.142*radius*height;
    }
    public double volume() {
        return Math.PI*radius*radius*height;
    }
}
public class CWH_44_Ch9PracticeSet {
    public static void main(String[] args) {
//        cylinder cy = new cylinder();                  // problem 1 & 2
        // problem 1
//        cy.setRadius(4);
//        cy.setHeight(6);
////        System.out.println("radius: " + cy.getRadius());
//        cy.getRadius();               // in this way, repeatability can be eliminated
//        System.out.println(cy.getHeight());
//        // problem 2
//        System.out.println("Surface area: " + cy.surfaceArea()); // no use of getter setter as it has to be calculated simply from the given values
//        System.out.println("Volume: " + cy.volume());

        // problem 3: Repeat 1 & 2 using Constructor
        cylinder cy = new cylinder(4, 7);
        cy.getRadius();
        System.out.println(cy.getHeight());
        System.out.println("Surface Area" + cy.surfaceArea());
        System.out.println("Volume: " + cy.volume());

        // problem 4: Overload a Constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
        // see part 2




    }
}
