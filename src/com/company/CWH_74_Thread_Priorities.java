package com.company;

class MyThr74 extends Thread {
    public MyThr74(String name) {
        super(name);
    }

    public void run() {
//        int j = 15;
//        System.out.println("Thank you " + this.getName());
        int i = 0;
        while (i<300) {
            System.out.println("Thank you " + this.getName());
//            System.out.println("I am a thread");
            i++;
        }
    }
}

public class CWH_74_Thread_Priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr74 t1 = new MyThr74("Harry1");
        MyThr74 t2 = new MyThr74("Harry2");
        MyThr74 t3 = new MyThr74("Harry3");
        MyThr74 t4 = new MyThr74("Harry4");
        MyThr74 t5 = new MyThr74("Harry5 (most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

