package com.pushpa.corejava.miscellaneous;

import java.util.stream.IntStream;

public class PalindromString {
    public static void main(String[] args) {
        String s = "madam";
        // Palindrome using Java 8 Streams
        boolean reverseS = IntStream.range(0,s.length()).noneMatch(value -> s.charAt(value) != s.charAt(s.length()-1-value));
        System.out.println("Palindrome or not : "+reverseS);

        String ss = "pushpa";
        boolean reverseSs = IntStream.range(0,ss.length()).noneMatch(value -> ss.charAt(value) != ss.charAt(ss.length()-1-value));
        System.out.println("Palindrome or not : "+reverseSs);
    }
}
