package com.pushpa.corejava.streams.processing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee {
    private int empId;
    private String empName;
    private int age;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(int empId, String empName, int age) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
    }
}

public class MinMaxDemo {
    public static void main(String[] args) {
        // Get Min or Max Number
        Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("maxNumber : "+maxNumber);

        Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("minNumber : "+minNumber);

        // Get Min or Max String/Char
        String maxChar = Stream.of("Has", "ATab", "Dad", "Ias", "Jan")
                .max(Comparator.comparing(String::valueOf))
                .get();
        System.out.println("maxChar : "+maxChar);

        String minChar = Stream.of("H", "T", "D", "I", "J")
                .min(Comparator.comparing(String::valueOf))
                .get();
        System.out.println("minChar : "+minChar);

        //Find max or min object by object property
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(111,"abc",20));
        employees.add(new Employee(222,"xyz",40));
        employees.add(new Employee(333,"mno",30));
        employees.add(new Employee(444,"pqr",10));
        employees.add(new Employee(555,"def",70));

        Employee minE1 = employees.stream().min(Comparator.comparing(Employee::getEmpName)).get();
        Employee maxE1 = employees.stream().max(Comparator.comparing(Employee::getEmpName)).get();

        System.out.println("minE1 : "+minE1);
        System.out.println("maxE1 : "+maxE1);

        Employee minE2 = employees.stream().min(Comparator.comparing(Employee::getAge)).get();
        Employee maxE2 = employees.stream().max(Comparator.comparing(Employee::getAge)).get();

        System.out.println("minE2 : "+minE2);
        System.out.println("maxE2 : "+maxE2);

    }

}
