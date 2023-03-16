package com.pushpa.corejava.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;


import java.util.concurrent.Callable;

class CallableThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Inside Call "+Thread.currentThread().getName());
        Thread.sleep(1);
        return 100;
    }
}
public class CallableThreadMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Inside Main "+Thread.currentThread().getName());
        FutureTask<Integer> f = new FutureTask<>(new CallableThread());
        Thread t1 = new Thread(f);
        t1.start();
        System.out.println("Between "+Thread.currentThread().getName());
        System.out.println("Future Task Value "+f.get());
        System.out.println("End "+Thread.currentThread().getName());
    }
}
