package com.pushpa.corejava.scope;

public class Singleton {
    private static Singleton INSTANCE = null;
    private Singleton() {

    }
    // Thread Safe singleton
    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

//    private static volatile Singleton instance;
//    private static Object mutex = new Object();
//    public static Singleton getInstance() {
//        Singleton result = instance;
//        if (result == null) {
//            synchronized (mutex) {
//                result = instance;
//                if (result == null)
//                    instance = result = new Singleton();
//            }
//        }
//        return result;
//    }
}
