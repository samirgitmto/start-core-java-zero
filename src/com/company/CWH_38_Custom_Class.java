package com.company;

class Employee{         // public class can't be used here as one public class is already below
    int id;             // always use Pascal Convention to name a class (start with capital letter)
    int salary;
    String name;

    public void printDetails() {                // always use camelCase convention to name a function (small letter first)
        System.out.println("id: " + id);        // void doesn't require return keyword. Will simply give the implementation
        System.out.println("name: " + name);
    }

    public int getSalary() {                    // unlike void, this function having int will require return keyword to return something.
        return salary;
    }
}
//Only 1 public class can be created in 1 file
public class CWH_38_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee Samir = new Employee();   // Instantiating a new Object (Employee here)
        Employee talish = new Employee();

        //Setting attributes
        Samir.id = 5;
        Samir.name = "Mohammad Samir";
        Samir.salary = 4000;

        talish.id = 9;
        talish.name = "Mohammad Yasir";
        talish.salary = 50000;

        // printing the attributes
//        System.out.println("id: " + Samir.id);
//        System.out.println("name: " + Samir.name);
        Samir.printDetails(); // another way to print by adding printDetails in Employee class
        talish.printDetails();
        int salary = Samir.getSalary();
        System.out.println(salary);
//        System.out.println(Samir.getSalary());    // same as just above
    }
}
