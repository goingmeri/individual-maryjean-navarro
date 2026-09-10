package com.joysistvi.stage2.day19; // MUST be identical to the package statement in Activity13_Navarro

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("    USER ACCOUNT REGISTRATION       ");
        System.out.println("====================================\n");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter Middle Name (press Enter if none): ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine().trim();

        String email = "";
        while (true) {
            System.out.print("Enter Email Address: ");
            email = scanner.nextLine().trim();
            if (Activity13_Navarro.isValidEmail(email)) {
                break;
            } else {
                System.out.println(" [ERROR] Invalid email format (e.g., name@example.com). Please try again.\n");
            }
        }

        String password = "";
        while (true) {
            System.out.print("Enter Password (min. 8 chars, letters & numbers): ");
            password = scanner.nextLine();
            if (Activity13_Navarro.isValidPassword(password)) {
                break;
            } else {
                System.out.println(" [ERROR] Password must be at least 8 characters long and include both letters and numbers.\n");
            }
        }

        Activity13_Navarro user = new Activity13_Navarro(firstName, middleName, lastName, address, email, password);

        System.out.println("\n====================================");
        System.out.println("   ACCOUNT CREATED SUCCESSFULLY     ");
        System.out.println("====================================");
        System.out.println("Full Name : " + user.getFullName());
        System.out.println("Email     : " + user.getEmail());
        System.out.println("Address   : " + user.getAddress());
        System.out.println("====================================");

        scanner.close();
    }
}