package com.pushpa.corejava.miscellaneous;

public class DemoClass {

    static final String sample = "simple";
    // String output = sample+"sample"; // we can't use non static fields in static main method
    static String output = sample+"sample";
    public static void main(String[] args) {
//        if (true) {
//            break;
//        }
        System.out.println("java");
        System.out.println('j'+'a');
        System.out.println('j'+'a'+'v'+'a');
        String a = null;
        String b = "world";
        System.out.println(a+b);

        int c = 5, d = 7;
        System.out.println(c+d);
        if ("simplesample" == output)
            System.out.println("equal"); // this will execute
        else
            System.out.println("not equal");

    }
}
