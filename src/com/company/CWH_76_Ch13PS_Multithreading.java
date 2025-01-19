package com.company;
// problem 1 - 5
class PSone extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("good morning" + getName());
            i++;
        }
    }
}
class PSone2 extends Thread {
    public void run() {
        int i = 0;
        while (i<10) {
            try {
                Thread.sleep(2);        //Pause for 4 seconds
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("welcome" + getName());
            i++;
        }
    }
}

public class CWH_76_Ch13PS_Multithreading {
    public static void main(String[] args) {
        PSone ps1 = new PSone();
        PSone2 ps2 = new PSone2();
//        ps1.setPriority(8);
//        ps2.setPriority(2);
        ps1.start();
//        ps2.start();
        System.out.println(ps1.getPriority());
        System.out.println(ps2.getPriority());
        System.out.println(ps1.getState());
        System.out.println(ps2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
