package com.pushpa.corejava.threads.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFeature {

    public static void main(String[] args) throws ExecutionException,InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(
                CompletableFuture.runAsync(new Thread22("test10")),
                CompletableFuture.runAsync(new Thread22("test11")),
                CompletableFuture.runAsync(new Thread22("test12")));
        completableFuture.thenRun(new Thread22("test111"));
    }
}
