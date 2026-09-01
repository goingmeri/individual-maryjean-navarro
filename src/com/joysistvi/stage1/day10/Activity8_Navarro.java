package com.joysistvi.stage1.day10;
import java.util.Scanner;

public class Activity8_Navarro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("\nYou entered: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;

        System.out.println("\n\nSum: " + sum);
        System.out.println("Average: " + average);

        // Stretch goal: highest and lowest
        int highest = numbers[0];
        int lowest = numbers[0];

        for (int number : numbers) {
            if (number > highest) {
                highest = number;
            }
            if (number < lowest) {
                lowest = number;
            }
        }

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);

        input.close();
    }
}