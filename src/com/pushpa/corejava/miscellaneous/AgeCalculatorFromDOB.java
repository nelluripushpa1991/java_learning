package com.pushpa.corejava.miscellaneous;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorFromDOB {
    public static void main(String[] args) {
        // Define the date of birth
        LocalDate birthDate = LocalDate.of(1991, 7, 21); // Example: 10th March 1995

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the age
        int age = Period.between(birthDate, currentDate).getYears();

        // Print the age
        System.out.println("Age: " + age + " years");
    }
}
