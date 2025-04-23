package com.pushpa.corejava.interview.aa;

import com.pushpa.interview.coding.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActiveEmployeeByDepartment {
    public static void main(String[] args) {
        // Write a Java method using Stream API to:
        // Filter only active employees.
        // Group them by department.
        // Sort each department’s list by salary in descending order

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"aaa","cse", 1000.00, true));
        empList.add(new Employee(2,"bbb","it", 4000.00, true));
        empList.add(new Employee(3,"ccc","cse", 5000.00, false));
        empList.add(new Employee(4,"ddd","ecs", 2000.00, true));
        empList.add(new Employee(5,"eee","eee", 8000.00, true));
        empList.add(new Employee(6,"fff","ecs", 3000.00, false));
        empList.add(new Employee(7,"ggg","cse", 7000.00, true));
        Map<String,List<Employee>> finalMap = activeEmployeeList(empList);
        finalMap.entrySet().stream().forEach(entry -> System.out.println("Key : "+entry.getKey()+" - Value : "+entry.getValue()));

    }
    public static Map<String, List<Employee>> activeEmployeeList(List<Employee> employeeList) {
        return employeeList.stream().filter(emp -> emp.isActive()).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.collectingAndThen(Collectors.toList(), empList -> empList.stream().sorted(Comparator.comparing(Employee::getDepartment).reversed()).collect(Collectors.toList()))));
    }
}
