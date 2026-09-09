package com.joysistvi.stage2.day17;
import java.util.Random;
import java.util.Scanner;

public class Activity12_Navarro {
    // 1. Method to identify if a number is odd or even
    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("#1: \n" + number + " is Even.");
        } else {
            System.out.println("#1: \n" + number + " is Odd.");
        }
    }

    // 2. Method to print your name 50 times
    public static void printNameFiftyTimes(String name) {
        for (int i = 1; i <= 50; i++) {
            System.out.println("#2\n" + i + ". " + name);
        }
    }

    // 3. Method to get the square root of a certain variable
    public static double getSquareRoot(double number) {
        return Math.sqrt(number);
    }

    // 4. Method to get the power of a number using base and exponent
    public static double getPower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // 5. Method to print a random number between 1 and 100
    public static void printRandomNumber() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1; // Generates 1 to 100
        System.out.println("#5: \nRandom Number (1-100): " + randomNumber);
    }

    // 6. Method to get the area of a circle using the given radius
    public static double getAreaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // 7. Method to identify if a person is a voter or not (Age 18 and above)
    public static void checkVoterEligibility(int age) {
        if (age >= 18) {
            System.out.println("#7: \nEligible to vote.");
        } else {
            System.out.println("#7: \nNot eligible to vote.");
        }
    }

    // 8. Method to get the length of a certain word
    public static int getWordLength(String word) {
        return word.length();
    }

    // 9. Method to print a certain word in reverse order
    public static void printWordInReverse(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("#9: \nReversed Word: " + reversed);
    }

    // 10. Method to print your full name and age
    public static void printFullNameAndAge(String fullName, int age) {
        System.out.println("#10: \nFull Name: " + fullName);
        System.out.println("Age: " + age);
    }

    // Main method to test all the operations
    public static void main(String[] args) {
        System.out.println("=== Testing Activity 12 Methods ===\n");

        // 1. Odd or Even
        checkOddOrEven(7);

        // 2. Print Name 50 Times
        printNameFiftyTimes("Mary Jean");

        // 3. Square Root
        System.out.println("#3: \nSquare Root of 25.0: " + getSquareRoot(25.0));

        // 4. Power
        System.out.println("#4: \n2 raised to power 3: " + getPower(2, 3));

        // 5. Random Number
        printRandomNumber();

        // 6. Area of Circle
        System.out.printf("#6: \nArea of Circle (radius 5): %.2f\n", getAreaOfCircle(5));

        // 7. Voter Eligibility
        checkVoterEligibility(20);

        // 8. Length of Word
        System.out.println("#8: \nLength of 'Volunteer': " + getWordLength("Volunteer"));

        // 9. Word in Reverse
        printWordInReverse("Java");

        // 10. Full Name and Age
        printFullNameAndAge("Alex Morgan", 22);
    }
}
