package com.joysistvi.stage1.day12;

import java.util.Random;

public class MathClass {

    public static void main(String[] args) {
        // for (int i = 0; i < 20; i++) {
        //     System.out.println(Math.random() * 58);
        // }

        /* Random Class
            Random random = new Random();
            System.out.println(random.nextInt(58) + 1);
        */

        // Casting
        // double decNum = 58.59;

        // int num = (int) decNum;
        // System.out.println(num);

        // Bingo Simulator
        int roll = (int) (Math.random() * 75) + 1; // Updated to 75 if aiming for full B-I-N-G-O range (1–75)
        String letter;

        if (roll <= 15) {          // 1 - 15
            letter = "B";
        } else if (roll <= 30) {   // 16 - 30
            letter = "I";
        } else if (roll <= 45) {   // 31 - 45
            letter = "N";
        } else if (roll <= 60) {   // 46 - 60
            letter = "G";
        } else {                   // 61 - 75
            letter = "O";
        }

        System.out.println(letter + " - " + roll);
    }
}