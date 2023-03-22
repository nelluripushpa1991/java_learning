package com.pushpa.corejava.functionalInterface.predefinedFunctionalInterface;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] agrs) {
        // way1 without functional interfaces
//        PredicateDemo predicateDemo = new PredicateDemo();
//        boolean b = predicateDemo.verify(4);
//        System.out.println("given number is greater than 5 : "+b);

        // way2 with predicate functional interfaces
        Predicate<String> predicate = s -> s.length() > 5;
        predicate.test("pushpa");
        System.out.println("given number is greater than 5 : "+predicate.test("pushpa"));

    }

    // standard way1 without functional interfaces
//    public boolean verify(Integer integer) {
//        if (integer > 5) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
