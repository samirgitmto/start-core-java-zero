package com.company;          //for faster and concurrent execution.
// creating a Thread 'by extending Thread class'. 1st of 2 ways to create a thread in Java.
class MyThread1 extends Thread {     //Thread class has its implementation in Thread.java
    public void run() {             // run is to be used.
        int i = 0;
        while(i<50) {
            System.out.println("Thread1 for cooking ..... happy");
            i++;
        }
    }             // Concurrency is achieved through the interleaving operation of processes on the central processing unit(CPU). Handled by a single CPU.
}                  // or in other words by the context switching. that’s rationale it’s like parallel processing. It increases the amount of work finished at a time.
class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while(i<50) {
            System.out.println("Thread2 for chatting ...... good");
            i++;
        }
    }
}

public class CWH_70_Multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        // method 'run', action 'start'
        t1.start();             // "start" method is used to start a Thread.
        t2.start();             // while the run, it goes concurrently. that means sometimes Thread1 is running and sometime Thread2 is running.
    }
}
