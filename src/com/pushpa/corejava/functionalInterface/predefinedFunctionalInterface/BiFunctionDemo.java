package com.pushpa.corejava.functionalInterface.predefinedFunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {
        // way1 without functional interfaces
        BiFunctionDemo biFunctionDemo = new BiFunctionDemo();
        biFunctionDemo.add(10,10);

        // way2 with bifunction functional interfaces
        BiFunction<Integer,Integer,Integer> function = (a,b) -> a+b;
        function.apply(20,20);
        System.out.println(function.apply(20,30));

    }

    // way1 without functional interfaces
    public int add(int a, int b) {
        System.out.println("added number : "+(a+b));
        return a+b;
    }
}
