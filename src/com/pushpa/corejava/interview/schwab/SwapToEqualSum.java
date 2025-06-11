package com.pushpa.corejava.interview.schwab;
import java.util.*;

public class SwapToEqualSum {
    public static int[] findSwapPair(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int diff = sumA - sumB;

        // If the difference is odd, it's not possible
        if (diff % 2 != 0) return null;

        int target = diff / 2;

        // Store all elements of A in a set for fast lookup
        Set<Integer> setA = new HashSet<>();
        for (int num : A) {
            setA.add(num);
        }

        // Check if there's a number in A such that a - b = target
        for (int b : B) {
            int a = b + target;
            if (setA.contains(a)) {
                return new int[]{a, b}; // Pair found
            }
        }

        return null; // No pair found
    }

    public static void main(String[] args) {
        int[] A = {4, 1, 2, 1, 1, 2};
        int[] B = {3, 6, 3, 3};

        int[] result = findSwapPair(A, B);
        if (result != null) {
            System.out.println("Swap: " + result[0] + " with " + result[1]);
        } else {
            System.out.println("No valid pair found to swap.");
        }
    }
}

