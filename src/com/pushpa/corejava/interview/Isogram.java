package com.pushpa.corejava.interview;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
        System.out.println("isIsogram : "+isIsogram("pen"));
        System.out.println("isIsogram : "+isIsogram("codedecode"));
    }
    public static boolean isIsogram(String str) {
        boolean isIsogram = true;
        char[] chArray = str.toCharArray();
        Set<Character> chSet = new HashSet<>();
        for (Character ch : chArray) {
            if(chSet.contains(ch)) {
                isIsogram = false;
            } else {
                chSet.add(ch);
            }
        }
        return isIsogram;
    }
}
