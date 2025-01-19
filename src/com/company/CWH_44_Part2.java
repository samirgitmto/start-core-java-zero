package com.company;                       // package

class rectangle2 {                  // problem 4
    private int l;
    private int b;

    public rectangle2() {             // Constructor
        this.l = l;
        this.b = b;
    }

    public rectangle2(int len, int bre) {   // Constructor Overloading
        this.l = len;
        this.b = bre;
    }

    public int getL() { return l; }         // only getters used as value was already assigned in the constructor
    public void setL(int l) { this.l = l; }     // *** between the *marked ones, this assignment will be prioritised
    public int getB() { return b; }         // Also, Value can be assigned later in the main function while creating the object
    public void setB(int b) { this.b = b; }
    public double area() { return l * b; }
}

public class CWH_44_Part2 {
    public static void main(String[] args) {
        rectangle2 rec = new rectangle2();       // this will be given priority in case of overloading
        rec.setL(5);                           // ***
        rec.setB(4);
        System.out.println(rec.getL());
        System.out.println(rec.getB());
        System.out.println(rec.area());

        rectangle2 rec2 = new rectangle2(12,8);
        System.out.println(rec2.getL());

        // problem 5: repeat for sphere later
    }
}
