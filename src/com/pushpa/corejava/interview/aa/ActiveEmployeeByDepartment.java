package com.pushpa.corejava.interview.aa;

import com.pushpa.interview.coding.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActiveEmployeeByDepartment {
    public static void main(String[] args) {
        // Write a Java method using Stream API to:
        // Filter only active employees.
        // Group them by department.
        // Sort each department’s list by salary in descending order

        List<Employee> empList = Stream.of(
        (new Employee(1,"aaa","cse", 1000.00, true)),
        (new Employee(2,"bbb","it", 4000.00, true)),
        (new Employee(3,"ccc","cse", 5000.00, false)),
        (new Employee(4,"ddd","ecs", 2000.00, true)),
        (new Employee(5,"eee","eee", 8000.00, true)),
        (new Employee(6,"fff","ecs", 3000.00, false)),
        (new Employee(7,"ggg","cse", 7000.00, true))).collect(Collectors.toList());
//        Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(collect);
        Map<String,List<Employee>> finalMap = activeEmployeeList(empList);
        //finalMap.entrySet().stream().forEach(entry -> System.out.println("Key : "+entry.getKey()+" - Value : "+entry.getValue()));
        System.out.println(finalMap);
    }
    public static Map<String, List<Employee>> activeEmployeeList(List<Employee> employeeList) {
        return employeeList.stream().filter(emp -> emp.isActive()).collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(Collectors.toList(), empList -> empList.stream()
                        .sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()))));
    }
}
