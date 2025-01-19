package com.company;

class MyThr75 extends Thread {

    public void run() {
//        int j = 15;
//        System.out.println("Thank you " + this.getName());
        int i = 0;
        while (i<300) {
            System.out.println("Thank you " + this.getName());
            try {                                     //this whole try and catch eill stop this method for 250 milliseconds.
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyThr75II extends Thread {

    public void run() {
//        int j = 15;
//        System.out.println("Thank you " + this.getName());
        int i = 0;
        while (i<300) {
            System.out.println("Thank you !! " + this.getName());
//            System.out.println("I am a thread");
            i++;
        }
    }
}

public class CWH_75_Thread_methods {
    public static void main(String[] args) {
        MyThr75 t1 = new MyThr75();
        MyThr75II t2 = new MyThr75II();
        t1.start();
//        try {
//            t1.join();     //don't start t2 with t1. this .join 'kw' will start t2 only after the complete execution of t2.
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }
}