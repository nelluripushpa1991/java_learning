package com.pushpa.corejava.functionalInterface.predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        // way1 without functional interfaces
//        FunctionDemo functionDemo = new FunctionDemo();
//        Integer integer = functionDemo.multiply(5);
//        System.out.println("Multiplied values of given number "+integer);

        // way2 with function functional interfaces
        Function<Integer, Integer> function = integer1 -> integer1*integer1;
        function.apply(10);
        System.out.println("Multiplied values of given number "+function.apply(10));

    }

    // way1 without functional interfaces
//    public Integer multiply(Integer integer) {
//        return integer*integer;
//    }
}
