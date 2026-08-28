package com.joysistvi.stage1.day7;
import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {
        // Age Categorizer
        /* Requirements
            Age: 0 - 2 Category: Baby
            Age: 3 - 12 Category: Child
            Age: 13 - 19 Category: Teenager
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Age Categorizer ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age <= 2) { // 0 - 2
            System.out.println("Category: Baby");
        } else if (age <= 12) { // 3 - 12
            System.out.println("Category: Child");
        } else if ( age <= 19) {
            System.out.println("Category: Teenager");
        } else {
            System.out.println("Invalid Input");
        }
        if (age >= 0 && age <= 120) { // Validation
            if (age <= 2) { // 0 - 2
                System.out.println("Category: Baby");
            } else if (age <= 12) { // 3 - 12
                System.out.println("Category: Child");
            } else if ( age <= 19) {
                System.out.println("Category: Teenager");
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Age! Age must be greater 0");
        }
    }
}
