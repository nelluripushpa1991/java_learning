package com.pushpa.corejava.logics;

public class PrimeNumber {
    public static void main(String[] args) {
//        int n = 7;
//        if (primeNumberOrNot(n))
//            System.out.println("Prime Number");
//        else
//            System.out.println("Not Prime Number");

        //print prime numbers series
        printNPrimeNumbers(20);
    }
    public static boolean primeNumberOrNot(int n) {
        if (n <= 1)
            return false;
        if (n == 2) return true;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
                //System.out.println("Prime Numbers : "+i);
            }
        }
        if (n%2 == 0) {
            return false;
        }
        return true;
    }
    public static void printNPrimeNumbers(int n) {
        for(int i=0; i<n; i++) {
            boolean primeNumbers = primeNumberOrNot(i);
            if (primeNumbers) System.out.print("Prime Numbers : "+i+" ");
            //else System.out.println("Not Prime Numbers : "+i);
        }
    }
}
