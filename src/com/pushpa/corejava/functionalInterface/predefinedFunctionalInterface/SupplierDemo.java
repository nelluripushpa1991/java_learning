package com.pushpa.corejava.functionalInterface.predefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // way1 without functional interfaces
//        SupplierDemo supplierDemo = new SupplierDemo();
//        supplierDemo.newDate();
//        System.out.println("Data : "+supplierDemo.newDate());

        // way2 with function functional interfaces
        Supplier<Date> supplier = () -> new Date();
        supplier.get();
        System.out.println("Data1 : "+supplier.get());
    }

    // way1 without functional interfaces
//    public Date newDate() {
//        return new Date();
//    }
}
