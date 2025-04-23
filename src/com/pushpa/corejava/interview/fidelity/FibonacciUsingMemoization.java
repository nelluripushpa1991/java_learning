package com.pushpa.corejava.interview.fidelity;

import java.util.HashMap;
import java.util.Map;

public class FibonacciUsingMemoization {
    public static void main(String[] args) {
        System.out.println("Check Fibonacci : "+fibonacciCheck(10));
    }

    public static int fibonacciCheck(int num) {
        Map<Integer, Integer> memo = new HashMap<>();
        if (num <= 1) return num;
        if (memo.containsKey(num)) return memo.get(num);
        int result = fibonacciCheck(num-1) + fibonacciCheck(num-2);
        memo.put(num, result);
        return result;
    }
}
