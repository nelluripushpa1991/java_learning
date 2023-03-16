package com.pushpa.corejava.threads;

class Thread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Inside run method "+Thread.currentThread().getName());
    }
}
public class RunnableThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Initial " + Thread.currentThread().getName());
        Thread t1 = new Thread(new Thread2());
        t1.start();
        System.out.println("Between " + Thread.currentThread().getName());
        Thread.sleep(10);
        System.out.println("Last " + Thread.currentThread().getName());
        System.out.println("End " + Thread.currentThread().getName());

    }

}
