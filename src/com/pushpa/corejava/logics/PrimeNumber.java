package com.pushpa.corejava.logics;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 8;
        if (primeNumberOrNot(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
    public static boolean primeNumberOrNot(int n) {
        if (n <= 1)
            return false;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
