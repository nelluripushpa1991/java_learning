package com.pushpa.corejava.miscellaneous;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
    String id;
    String name;
    int age;

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
public class DuplicateEmployeeNameCount {

    public static void main(String[] args) {

        List<Employee> employeeList = Stream.of(
        new Employee("111","pushpa",30),
        new Employee("222","roja",30),
        new Employee("333","pushpa",30),
        new Employee("444","vanaja",30),
        new Employee("555","roja",30),
        new Employee("666","latha",30)).toList();

        // using java 8 streams
        Map<String, Long> nameCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(nameCount);

        // Other way without java 8 streams
        System.out.println("normal way without java 8 features streams");
        Map<String, Integer> integerMap = new HashMap<>();
        for (Employee e: employeeList) {
            if (!integerMap.containsKey(e.getName())) {
                integerMap.put(e.getName(),1);
            } else {
                integerMap.put(e.getName(), integerMap.getOrDefault(e.getName(),0)+1);
            }
        }
        System.out.println(integerMap);
    }
}
