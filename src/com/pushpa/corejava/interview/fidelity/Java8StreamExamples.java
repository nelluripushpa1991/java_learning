package com.pushpa.corejava.interview.fidelity;

import com.pushpa.interview.coding.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamExamples {
    public static void main(String[] args) {
        // remove students those percentage is < 70
        List<Student> studentList = getStudents();
        studentList.removeIf(s -> s.getPercentage() < 70);
        for (Student s : studentList) {
            System.out.println(s);
        }
        System.out.println("****************************");
        // remove students those percentage is < 70 using java streams
        List<Student> studentList1 = getStudents();
        List<Student> filteredList = studentList1.stream().filter(f -> f.getPercentage() > 70).collect(Collectors.toList());
        for (Student f : filteredList) {
            System.out.println(f);
        }
        System.out.println("****************************");
        // remove students those percentage is < 70 using java streams
        List<Student> studentList2 = getStudents();
        Long count = studentList1.stream().filter(f -> f.getPercentage() > 70).count();
        System.out.println(count);


    }



    public static List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"a","aa","it", 71));
        studentList.add(new Student(2,"b","bb","cse", 81));
        studentList.add(new Student(3,"c","cc","ece", 61));
        studentList.add(new Student(4,"d","dd","it", 91));
        studentList.add(new Student(5,"e","ee","ece", 51));
        return studentList;
    }
}
