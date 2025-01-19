package com.company;

class Cub {                                         // Class and its attributes
    int l;
    int b;
    int h;
    double sa;

    Cub (int l, int b, int h) {                         // Parameterised Constructor with dynamic initialization
        this.l = l;    this.b = b;       this.h = h;
    }

    public double surfaceArea() {                       // Method to call upon the result and details
        System.out.print("length = " + l + "; ");
        System.out.print("breadth = " + b + "; ");
        System.out.print("height = " + h + "; ");
        System.out.print("Surface area is ");
        return 2*(this.l*this.b + this.l*this.h + this.h*this.b);
    }
}

public class CWH_51_exercize4 {                  // main class
    public static void main(String[] args) {
        Cub cbsa = new Cub(10, 9, 8);          // Instantiation

        System.out.println(cbsa.surfaceArea());
    }
}
/* You have to implement a library using Java Class Library.
        Methods: addBook, issueBook, returnBook, showAvailableBooks
        Properties: Array to store the available books,
        Array to store the issued books
         */
