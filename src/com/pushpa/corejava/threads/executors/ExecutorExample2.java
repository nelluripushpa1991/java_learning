package com.pushpa.corejava.threads.executors;


import java.util.concurrent.*;

class Thread22 implements Runnable {
    private String name;
    public Thread22(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            System.out.println("Initial "+Thread.currentThread().getName());
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("End  "+Thread.currentThread().getName());
    }
}
public class ExecutorExample2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.submit(new Thread22("test1"));
        scheduledExecutorService.submit(new Thread22("test2"));
        ScheduledFuture scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new Thread22("test1"),1,2, TimeUnit.SECONDS);
        scheduledFuture.get();
        scheduledExecutorService.shutdown();
    }


}
