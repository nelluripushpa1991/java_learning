package com.pushpa.corejava.interview.aa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRotation {

    public static <T> List<T> rotateRight(List<T> list, int k) {
        int n = list.size();
        k = ((k % n) + n) % n; // handle negative or large k

        return Stream.concat(
                        list.stream().skip(n - k),
                        list.stream().limit(n - k))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int k = 10;

        List<Integer> rotated = rotateRight(list, k);
        System.out.println(rotated);
    }
}
