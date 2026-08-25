package com.joysistvi.stage1.day6;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = sc.nextLine();

    System.out.println("Enter your age:");
    int age = sc.nextInt();

    System.out.println("Name: " + name);
    System.out.println("Age: " + age);

    int day = 17;

    if (day == 1) {
        System.out.println("Monday");
    } else if (day == 2) {
        System.out.println("Tuesday");
    } else if (day == 3) {
        System.out.println("Wednesday");
    } else if (day == 4) {
        System.out.println("Thursday");
    } else if (day == 5) {
        System.out.println("Friday");
    } else if (day == 6) {
        System.out.println("Saturday");
    } else if (day == 7) {
        System.out.println("Sunday");
    }  else {
        System.out.println("Invalid day");
    }
    }
}
