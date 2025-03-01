package com.pushpa.corejava.designpatterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, CloneNotSupportedException {
        Singleton originalSingletonInstance = Singleton.getInstance();
        Singleton duplicateSingletonInstance = Singleton.getInstance();
        System.out.println("originalSingletonInstance hashcode : "+originalSingletonInstance.hashCode());
        System.out.println("duplicateSingletonInstance hashcode : "+duplicateSingletonInstance.hashCode());
        System.out.println("****************************************************************************");

        // 1. Reflection
        Class<?> singletonClass = Class.forName("com.pushpa.corejava.designpatterns.singleton.Singleton");
        Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton brokenSingletonUsingReflectionInstance = constructor.newInstance();
        System.out.println("originalSingletonInstance hashcode : "+originalSingletonInstance.hashCode());
        System.out.println("brokenSingletonUsingReflectionInstance hashcode : "+brokenSingletonUsingReflectionInstance.hashCode());
        System.out.println("****************************************************************************");

        // 2. Serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\naren\\OneDrive\\Documents\\test.txt"));
        outputStream.writeObject(originalSingletonInstance);
        outputStream.close();
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\naren\\OneDrive\\Documents\\test.txt"));
        Singleton brokenSingletonUsingSerializationInstance = (Singleton) inputStream.readObject();
        System.out.println("originalSingletonInstance hashcode : "+originalSingletonInstance.hashCode());
        System.out.println("brokenSingletonUsingSerializationInstance hashcode : "+brokenSingletonUsingSerializationInstance.hashCode());
        System.out.println("****************************************************************************");

        // 3. Cloning
        Singleton brokenSingletonUsingCloningInstance = (Singleton) originalSingletonInstance.clone();
        System.out.println("originalSingletonInstance hashcode : "+originalSingletonInstance.hashCode());
        System.out.println("brokenSingletonUsingCloningInstance hashcode : "+brokenSingletonUsingCloningInstance.hashCode());
        System.out.println("****************************************************************************");





    }
}
