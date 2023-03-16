package com.pushpa.corejava.threads;


class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("inside run method"+Thread.currentThread().getName());
    }

}
public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Initial " + Thread.currentThread().getName());
        Thread1 t1 = new Thread1();
        t1.start();
        System.out.println("Between " + Thread.currentThread().getName());
        Thread.sleep(100);
        System.out.println("Last " + Thread.currentThread().getName());
        System.out.println("End " + Thread.currentThread().getName());

    }

}
