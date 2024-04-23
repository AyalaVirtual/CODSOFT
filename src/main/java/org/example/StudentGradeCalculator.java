package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentGradeCalculator {

    public StudentGradeCalculator() {
    }


    public void getGradesArray() {
        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter grades separated by a space. Example: 100 75 80 92");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] gradesInput = input.split(" ");
        ArrayList<Integer> gradesArray = new ArrayList<>();

        for (int i = 0; i < gradesInput.length; i++) {
            gradesArray.add(Integer.parseInt(gradesInput[i]));
        }


        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        int total = 0;

        for (int i = 0; i < gradesArray.size(); i++) {
            total += gradesArray.get(i);
        }


        // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
        int average = total / gradesArray.size();


        // Grade Calculation: Assign grades based on the average percentage achieved.
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'B';
        } else if (average >= 70 && average < 80) {
            grade = 'C';
        } else if (average >= 60 && average < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        // Display Results: Show the total marks, average percentage, and the corresponding grade to the user.
        System.out.println("Total marks: " + total);
        System.out.println("Average percentage: " + average);
        System.out.println("Grade: " + grade);
    }

}
