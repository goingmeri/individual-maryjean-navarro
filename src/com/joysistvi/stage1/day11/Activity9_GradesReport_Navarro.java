package com.joysistvi.stage1.day11;
import java.util.Scanner;

public class Activity9_GradesReport_Navarro {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("==================================");
            System.out.println("        Average Calculator        ");
            System.out.println("==================================");

            System.out.print("Enter number of students: ");
            int numStudents = scanner.nextInt();

            System.out.print("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.println("\nEnter subject names:");
            String[] subjects = new String[numSubjects];
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                subjects[i] = scanner.nextLine();
            }

            String[] studentNames = new String[numStudents];
            double[][] grades = new double[numStudents][numSubjects];
            double[] averages = new double[numStudents];

            for (int i = 0; i < numStudents; i++) {
                System.out.println();
                System.out.print("Name of Student " + (i + 1) + ": ");
                studentNames[i] = scanner.nextLine();

                System.out.println("Enter grades for each subject:");
                double sum = 0;
                for (int j = 0; j < numSubjects; j++) {
                    System.out.print(subjects[j] + ": ");
                    grades[i][j] = scanner.nextDouble();
                    sum += grades[i][j];
                }
                scanner.nextLine(); // Consume newline after reading numbers
                averages[i] = sum / numSubjects;
            }

            // Display Grades Report
            System.out.println("\n==================================");
            System.out.println("          Grades Report           ");
            System.out.println("==================================");

            // Header
            System.out.printf("%-15s", "Student");
            for (String subject : subjects) {
                System.out.printf("%-12s", subject);
            }
            System.out.printf("%-10s%n", "Average");

            // Separator line dynamically adjusted to subject count
            int lineLength = 15 + (numSubjects * 12) + 10;
            for (int i = 0; i < lineLength; i++) {
                System.out.print("-");
            }
            System.out.println();

            // Rows
            for (int i = 0; i < numStudents; i++) {
                System.out.printf("%-15s", studentNames[i]);
                for (int j = 0; j < numSubjects; j++) {
                    // Print grade as integer if no fraction exists, else decimal
                    if (grades[i][j] == (int) grades[i][j]) {
                        System.out.printf("%-12d", (int) grades[i][j]);
                    } else {
                        System.out.printf("%-12.2f", grades[i][j]);
                    }
                }
                System.out.printf("%-10.2f%n", averages[i]);
            }

            scanner.close();
    }
}
