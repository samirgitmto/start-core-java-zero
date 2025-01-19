package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public int getId() {             // getters return
        return id;
    }
    public void setId(int i) {
//        id = 1;                // can also use this.id in place of id // result = 1 as it is hard-coded
        this.id = i;             // if both codes are run, then only this one will be executed
    }

}
public class CWH_40_AccessModifiers_Constructors {
    public static void main(String[] args) {
        MyEmployee Samir = new MyEmployee();
//        Samir.id = 40;        // shows error due to private access modifier
//        Samir.name = "Steve";
        Samir.setName("Mohd Sameer");
        System.out.println(Samir.getName());
        Samir.setId(8);
        System.out.println(Samir.getId());  // error: previous id printed

    }
}
