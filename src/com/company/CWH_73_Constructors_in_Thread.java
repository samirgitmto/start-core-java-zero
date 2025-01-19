package com.company;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }
    public void run() {
        int j = 15;
        System.out.println("Thank you");
//        int i = 0;
//        while (i<3000) {
//            System.out.println("I am a thread");
//            i++;
//        }
    }
}

public class CWH_73_Constructors_in_Thread {
    public static void main(String[] args) {
        MyThr mt1 = new MyThr("Harry");
        MyThr mt2 = new MyThr("Ram Candr");
        mt1.start();
        mt2.start();
        System.out.println("The id of the thread mt1 is " + mt1.getId());
        System.out.println("The id of the thread mt1 is " + mt1.getName());
        System.out.println("The id of the thread mt2 is " + mt2.getId());
        System.out.println("The id of the thread mt2 is " + mt2.getName());

    }
}
