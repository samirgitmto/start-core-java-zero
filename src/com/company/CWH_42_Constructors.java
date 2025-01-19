package com.company;

class MyMainEmployee {
    private int id;
    private int salary;
    private String name;

    public MyMainEmployee() {       // constructors introduced here          // hard-coded values here as they have been assigned with an equality sign here
//        id = 45;                    // gets automatically invoked            // so, it can't be dynamic
        name = "your name here";
    }
    public MyMainEmployee(String myName, int myId) {       // Just like method overloading, Constructor Overloading is also feasible
        id = myId;
        name = myName;
    }
    public MyMainEmployee(int empSalary) {       // there can be more than 2 overloaded constructors
        salary = empSalary;
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }

    public int getId() { return id; }
    public void setId(int i) { this.id = i; }
//    public void setId(int i) { this.id = 1; }
//                                                   // both id and salary will be 0 as setters is introduced after the getters (as per rules), and no value has been assigned
//    public int getSalary() { return salary; }        // in the main function
    public int getSalary() { return salary; }
    public void setSalary(int j) { this.salary = j; }
}
public class CWH_42_Constructors {
    public static void main(String[] args) {
//      MyMainEmployee harry = new MyMainEmployee("code with harry", 10);  // this object will detect constructor of same name
        MyMainEmployee harry = new MyMainEmployee();  // this object will detect constructor of same name
//        harry.setName("code with harry");    // without the use of constructors
        System.out.println(harry.getName());
        System.out.println(harry.getId());
        harry.setId(12);
        harry.setSalary(100);
        System.out.println(harry.getId());
//        System.out.println(harry.getSalary());  // error: showing 0 salary because the identified constructor does not have salary
        System.out.println(harry.getSalary());    // solved by putting the same variable 'j' in the Setters
    }
}
