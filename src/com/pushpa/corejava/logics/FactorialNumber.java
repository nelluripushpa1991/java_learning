package com.pushpa.corejava.logics;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("num : "+num+" : "+factorialIterativeApproach(num));
        System.out.println("num : "+num+" : "+factorialRecursiveApproach(7));
    }
    public static int factorialIterativeApproach(int n) {
        int fact = 1;
        for (int i=2; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int factorialRecursiveApproach(int n) {
        return (n == 0 || n == 1) ? 1 :n*factorialRecursiveApproach(n-1);
    }
}
