package com.pushpa.interview.coding;

import java.util.*;
import java.util.stream.Collectors;

public class Sample1
{
    public static void main(String[] args) {
//        Write a Java method using Stream API to:
//        Filter only active employees.
//        Group them by department.
//        Sort each department’s list by salary in descending order

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1,"aaa","cse", 1000.00, true));
        empList.add(new Employee(2,"bbb","it", 4000.00, true));
        empList.add(new Employee(3,"ccc","cse", 5000.00, false));
        empList.add(new Employee(4,"ddd","ecs", 2000.00, true));
        empList.add(new Employee(5,"eee","eee", 0600.00, false));
        Map<String,List<Employee>> finalMap = activeEmployeeList(empList);
    }
    public static Map<String, List<Employee>> activeEmployeeList(List<Employee> employeeList) {
        Map<String, Long> map = employeeList.stream().filter(emp -> emp.isActive()).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Map<String, Long> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(integer, integer2) -> integer, LinkedHashMap::new));
        sortedMap.entrySet().stream().forEach(entry -> System.out.println(""+entry.getKey() +" : "+entry.getValue()));

        return employeeList.stream().filter(Employee::isActive)
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.toList(),list -> list.stream().sorted(Comparator.comparing(Employee::getDepartment).reversed()).collect(Collectors.toList()))));
    }
}
