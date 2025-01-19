package com.company;
// problem 1
class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}
// problem 2
class cellPhone{
    public void ringing() {
        System.out.println("Ringing......");
    }
    public void vibrating() {
        System.out.println("Vibrating.....");
    }
    public void callFriend() {
        System.out.println("Calling.....");
    }
}
// problem 3
class square{
    int side;
    public int area() {
        return side*side;
    }
    public int perimeter() {
        return 4*side;
    }
}
// problem 4
class rectangle{
    int length, breadth;
    public int area() {
        return length*breadth;
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
}
// problem 5
class tommy{
    public void hit() {
        System.out.println("hitting the enemy");
    }
    public void run() {
        System.out.println("running from the enemy");
    }
    public void fire() {
        System.out.println("firing on the enemy");
    }
}

public class CWH_39_Practice_CustomClass {
    public static void main(String[] args) {

//        // Problem 1
//        Employee1 samir = new Employee1();
//        samir.setName("Mohammad Samir");
//        samir.salary = 4000;
//        System.out.println(samir.getName());
//        System.out.println(samir.getSalary());
//
//        // problem 2
//        cellPhone vivo = new cellPhone();
//        vivo.callFriend();
//        vivo.vibrating();
//        vivo.ringing();

        // problem 3
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.perimeter());
        System.out.println(sq.area());

        // problem 4
        rectangle rc = new rectangle();
        rc.length = 4;
        rc.breadth = 3;
        System.out.println(rc.perimeter());
        System.out.println(rc.area());

        // problem 5
        tommy game = new tommy();
        game.hit();
        game.run();
        game.fire();
    }
}
