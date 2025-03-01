package com.pushpa.corejava.interview;

public class FebonacciUsingRecurssion {
    public static void main(String[] args) {
        System.out.println("febonacci series : "+febonacci(10));

    }

    public static int febonacci(int n) {
        if (n <= 1)
            return n;
        else
            return febonacci(n-1)+febonacci(n-2);
    }
}
