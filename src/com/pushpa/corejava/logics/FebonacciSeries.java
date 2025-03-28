package com.pushpa.corejava.logics;

public class FebonacciSeries {
    public static void main(String[] args) {
        // iterative approach
        febonacciSeriesIterativeApproach(10);
        System.out.println();
        System.out.println("*******************************************");
        // recursive approach
        for(int i=0; i<=5; i++) {
            System.out.print(febonacciSeriesRecursiveApproach(i)+" ");
        }

    }

    public static void febonacciSeriesIterativeApproach(int n) {
        int num1 = 0, num2 = 1;
        for (int i=0; i<=n; i++) {
            System.out.print(num1+ " ");
            int num3 = num1+num2;
            //swap logic
            num1 = num2;
            num2 = num3;
        }
    }
    public static int febonacciSeriesRecursiveApproach(int n) {
        if (n <= 1)
            return n;
        return febonacciSeriesRecursiveApproach(n-1)+febonacciSeriesRecursiveApproach(n-2);
    }
}

