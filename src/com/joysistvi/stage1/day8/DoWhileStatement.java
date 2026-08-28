package com.joysistvi.stage1.day8;
import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;
        do {
            System.out.println("Enter your email: ");
            String loginEmail = scanner.nextLine();

            System.out.println("Enter your password");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");
                isLoggedIn = true;
            } else {
                System.out.println("Login Failed!");
            }
        } while (!isLoggedIn);


        }
    }
