package com.joysistvi.stage1.day9;
import java.util.Scanner;

public class Activity7_Pt1_Navarro {
    public static void main(String[] args){
        int number;
        System.out.println("Enter number for multiplication table: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        System.out.println("Multiplication table of " + number + ": ");

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
