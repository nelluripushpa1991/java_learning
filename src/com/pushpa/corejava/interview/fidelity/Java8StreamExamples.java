package com.pushpa.corejava.interview.fidelity;

import com.pushpa.interview.coding.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        // count of students those percentage is > 70 using java streams
        List<Student> studentList2 = getStudents();
        Long count = studentList1.stream().filter(f -> f.getPercentage() > 70).count();
        System.out.println(count);

        // count of occurrences of char in given string
        String input = "ilovejavatechie";
        Map<Character, Long> map = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.print(map);

        // find duplicate chars in given string
        List<Map.Entry<Character, Long>> duplicateElements = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1).collect(Collectors.toList());
        System.out.print(duplicateElements);

        // find non nonRepeatChar chars in given string
        List<Map.Entry<Character, Long>> nonRepeatChar = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).collect(Collectors.toList());
        System.out.print(nonRepeatChar);

        // find first non nonRepeatChar char in given string
        Character key = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);

        // second highest number from given array
        int [] intArr = {1,5,9,12,45,62,23,14,18};
        Integer secondHighest = Arrays.stream(intArr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighest);

        // find elements from array who starts with 1
        List<String> collectElementsStartWith1 = Arrays.stream(intArr).boxed().map(s -> s + "").filter(f -> f.startsWith("1")).collect(Collectors.toList());
        System.out.println(collectElementsStartWith1);

        // longest string from given array
        String[] strArray = {"java", "techie", "springboot", "microservices"};
        String longestString = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);

        // String.join method
        List<String> list = Arrays.asList("1", "2", "3", "4");
        String result = String.join("-", list);
        System.out.println(result);

        // skip and limit example (2-9)
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(value -> System.out.println(value));

        // Find Nth highest salary

    }



    public static List<Student> getStudents() {
        List<Student> studentList = Stream.of(
        new Student(1,"a","aa","it", 71),
        new Student(2,"b","bb","cse", 81),
        new Student(3,"c","cc","ece", 61),
        new Student(4,"d","dd","it", 91),
        new Student(5,"e","ee","ece", 51)).collect(Collectors.toList());
        return studentList;
    }
}
