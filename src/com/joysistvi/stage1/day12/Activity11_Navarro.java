package com.joysistvi.stage1.day12;

public class Activity11_Navarro {
    public static void main(String[] args) {
        int player1Score = 45;
        int player2Score = 82;

        // Compares player1Score and player2Score, returning the larger number
        int highestScore = Math.max(player1Score, player2Score);

        System.out.println("The winning score is: " + highestScore); // Output: 82
    }
}
