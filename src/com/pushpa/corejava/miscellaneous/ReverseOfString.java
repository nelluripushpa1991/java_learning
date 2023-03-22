package com.pushpa.corejava.miscellaneous;

import java.util.stream.IntStream;

public class ReverseOfString {

    public static void main(String[] args) {
        String s = "I am good at java skills";

        // Using reverse() method
        System.out.println("using reverse() method");
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        // normal way
        System.out.println("using for loop method");
        for(int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        // using java 8 features
        char[] charArray = s.toCharArray();
        System.out.println("using for charArray method");
        IntStream.range(0, charArray.length)
                .mapToObj(i -> charArray[(charArray.length - 1) - i])
                .forEach(System.out::print);
        // 0,length
    }

}
