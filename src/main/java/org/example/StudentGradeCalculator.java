package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentGradeCalculator {
    ArrayList<Integer> gradesArray = new ArrayList<>();
    int total = 0;


    public ArrayList<Integer> getGradesArray() {
        // Input: Take marks obtained (out of 100) in each subject.
        System.out.println("Enter grades separated by a space. Example: 100 75 80 92");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] gradesInput = input.split(" ");

        for (int i = 0; i < gradesInput.length; i++) {
            gradesArray.add(Integer.parseInt(gradesInput[i]));
        }

        // return gradesArray;

        // Calculate Total Marks: Sum up the marks obtained in all subjects.
        for (int i = 0; i < gradesArray.size(); i++) {
            total += gradesArray.get(i);
        }

        System.out.println("Total: " + total);
        return gradesArray;
    }


    // Calculate Total Marks: Sum up the marks obtained in all subjects.
//    public int getTotal(int[] gradesArray) {
//        for (int i = 0; i < gradesArray.length; i++) {
//            total += gradesArray.get(i);
//            System.out.println(gradesArray.get(i));
//        }
//
//        return total;
//    }


    // Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.


    // Grade Calculation: Assign grades based on the average percentage achieved.


    // Display Results: Show the total marks, average percentage, and the corresponding grade to the user


}
