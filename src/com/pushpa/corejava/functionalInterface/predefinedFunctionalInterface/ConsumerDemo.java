package com.pushpa.corejava.functionalInterface.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        // way1 without functional interfaces
//        ConsumerDemo consumerDemo = new ConsumerDemo();
//        consumerDemo.multiply(3);
//        System.out.println("Multiplied values of given number ");

        // way2 with function functional interfaces
        Consumer<Integer> consumer = s -> System.out.println("square of given no : "+s*s);
        consumer.accept(8);
    }

    // way1 without functional interfaces
//    public void multiply(Integer integer) {
//        integer = integer*integer;
//    }
}
