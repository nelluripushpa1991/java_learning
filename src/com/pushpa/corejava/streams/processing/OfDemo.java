package com.pushpa.corejava.streams.processing;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class User {
    private String userName;
    private int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}

public class OfDemo {
    public static void main(String[] args) {
        System.out.println("--- IntStream ---");
        IntStream intStream = IntStream.of(12, 14, 16);
        intStream.forEach(e -> System.out.println(e));

        System.out.println("--- LongStream ---");
        LongStream longStream = LongStream.of(154L, 236L, 306L);
        longStream.forEach(e -> System.out.println(e));

        System.out.println("--- DoubleStream ---");
        DoubleStream doubleStream = DoubleStream.of(123.56, 456.87, 784.65);
        doubleStream.forEach(e -> System.out.println(e));

        System.out.println("--- EmployeeObjectStream ---");
        Stream<User> userStream = Stream.of(
                new User("Mahesh", 22),
                new User("Krishna", 20),
                new User("Suresh", 25)
        );
        userStream.forEach(u -> System.out.println(u.getUserName()));
    }

}
