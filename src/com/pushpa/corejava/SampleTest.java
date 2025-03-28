package com.pushpa.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleTest {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1L, "aaa","IT"));
        empList.add(new Employee(2L, "bbb","CSE"));
        empList.add(new Employee(3L, "ccc","IT"));
        empList.add(new Employee(4L, "ddd","ECE"));
        empList.add(new Employee(5L, "eee","CSE"));

        Map<String, Long> empCountDept = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        empCountDept.entrySet().stream().forEach(entry -> System.out.println("dept name : "+entry.getKey()+" count : "+entry.getValue()));
    }
}


class Employee {
    private Long id;
    private String name;
    private String dept;

    public Employee(Long id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
