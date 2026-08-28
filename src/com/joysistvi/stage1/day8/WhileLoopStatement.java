package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {
    public static void main(String[] args) {
        /*
            initialization
            while (condition) {
                statement / body of the loop
                inc / dec
            }
         */
        // Print numbers from 1 - 10

        /*
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        */

        Scanner scanner =new Scanner(System.in);

        boolean isRunning = false;

        while (!isRunning) {
            System.out.print("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program Stopped!");
                isRunning = true;
            }
        }

        // flag -> used to track / mark a variable whether a
        // specific condition or event has occured
    }
}
