package com.company;

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am a thread 1, not a threat");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("I am a thread 2, not a threat");
            i++;
        }
    }
}
public class CWH_71_Thread2_runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
// bullet gun bullet analogy to understand how runnable interface works.
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
//        t1.start();      -- error: can not directly execute start method using runnable interface
        gun1.start();
        gun2.start();
    }

}

