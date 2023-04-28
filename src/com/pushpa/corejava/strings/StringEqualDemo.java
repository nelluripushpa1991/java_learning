package com.pushpa.corejava.strings;

public class StringEqualDemo {
    public static void main(String args[]) {

        String s1 = "Mango";
        String s2 = new String("Mango");
        String s3 = "Mango";

        if (s1 == s2) {
            System.out.println("s1 and s2 have the same reference");
        } else {
            System.out.println("s1 and s2 have different references"); // this is executed
        }

        if (s1 == s3) {
            System.out.println("s1 and s3 have the same reference"); // this is executed
        } else {
            System.out.println("s1 and s3 have different references");
        }

        if (s1.equals(s2)){
            // s1 and s2 have the same contents
            System.out.println("s1 and s2 have the same contents");
        }

        if (s3.equals(s1)){
            // s3 and s1 have the same contents
            System.out.println("s3 and s1 have the same contents");
        }

        // intern method
        String str1 = new String("Berry").intern();
        String str2 = new String("Berry").intern();
        System.out.println(str1 == str2); // true
        System.out.println("str1 and str2 have the same contents");


    }
}
