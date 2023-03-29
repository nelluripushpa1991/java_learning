package com.pushpa.corejava.functionalInterface.predefinedFunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // way1 without functional interfaces
        BiPredicateDemo biPredicateDemo = new BiPredicateDemo();
        biPredicateDemo.addNumbers(5,10);

        // way2 with bipredicate functional interfaces
        BiPredicate<Integer,Integer> predicate = (a,b) -> a < b;
        predicate.test(5,10);
        System.out.println("boolean value : "+predicate.test(5,10));
    }

    // way1 without functional interfaces
    public boolean addNumbers(int a, int b) {
        System.out.println(a+b);
        return a < b;
    }
}
