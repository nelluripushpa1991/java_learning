package com.pushpa.corejava.miscellaneous;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class Employee1 {
    private String empName;
    private String location;

    public Employee1(String empName, String location) {
        this.empName = empName;
        this.location = location;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
public class EmployeeLocationSort {
    public static void main(String[] args) {
        List<Employee1> employeeList = new ArrayList<>();
        employeeList.add(new Employee1("raja","regina"));
        employeeList.add(new Employee1("pushpa","saskatchewan"));
        employeeList.add(new Employee1("anu","toronto"));
        employeeList.add(new Employee1("milky","ontario"));
        employeeList.add(new Employee1("pinky","toronto"));
        employeeList.add(new Employee1("silky","saskatchewan"));
        System.out.println("employeeList : "+employeeList);

        List<Employee1> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparing(Employee1::getLocation)
                .thenComparing(Employee1::getEmpName)).collect(Collectors.toList());
        System.out.println("sortedEmployeeList : "+sortedEmployeeList);
    }
}
