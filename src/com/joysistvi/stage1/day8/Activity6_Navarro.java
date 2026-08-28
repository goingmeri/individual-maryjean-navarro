package com.joysistvi.stage1.day8;
import java.util.Scanner;

public class Activity6_Navarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;
        int attempts = 0;
        int maxAttempts = 5;
        while (!isLoggedIn && attempts < maxAttempts) {
            System.out.println("Enter your email: ");
            String loginEmail = scanner.nextLine();

            System.out.println("Enter your password");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");
                isLoggedIn = true;
            } else {
                attempts++;
                int remaining = maxAttempts - attempts;
                if (remaining == 0) {
                    System.out.println("Login Failed! Please try again later.");
                } else {
                    System.out.println("Login Failed! Attempts remaining: " + (maxAttempts - attempts));
                }
            }
        }

    }
}
