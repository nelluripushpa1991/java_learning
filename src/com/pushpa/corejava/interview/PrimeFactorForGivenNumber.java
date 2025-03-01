package com.pushpa.corejava.interview;

public class PrimeFactorForGivenNumber {
    public static void main(String[] args) {
        printPrimeFactors(12);
    }

    // Method to print all prime factors of a given number
    public static void printPrimeFactors(int givenNumber) {
        if (givenNumber <= 1) {
            System.out.println("No prime factors for numbers less than or equal to 1.");
            return;
        }
        System.out.println("Prime factors of " + givenNumber + " are: ");
        //System.out.println();

        while (givenNumber % 2 == 0) {
            System.out.println(2 + " ");
            givenNumber /= 2;
        }
        for (int i = 3; i <= Math.sqrt(givenNumber); i += 2) {
            while (givenNumber % i == 0) {
                System.out.println(i+ " ");
                givenNumber /= i;
            }
        }
        if (givenNumber > 2)
            System.out.println(givenNumber);

        System.out.println();
    }

}
