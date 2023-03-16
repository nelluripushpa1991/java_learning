package com.pushpa.corejava.threads.executors;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Thread11 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Initial "+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End  "+Thread.currentThread().getName());
    }
}
public class ExecutorExample1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new Thread11());
        executorService.submit(new Thread11());
        executorService.shutdown();
    }


}
