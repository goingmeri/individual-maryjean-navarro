package com.joysistvi.stage1.day11;

public class Activity9_StringClass_Navarro {
    public static void main(String[] args) {

        String country = "Philippines";

        // 1. First and last character
        char firstChar = country.charAt(0);
        char lastChar = country.charAt(country.length() - 1);

        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        // 2. Count 'P' or 'p'
        int pCount = 0;
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (char c : country.toCharArray()) {
            // Check for P / p
            if (c == 'P' || c == 'p') {
                pCount++;
            }

            // Check for vowels
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Count of 'P/p': " + pCount);
        System.out.println("Total vowels: " + vowelCount);
    }
}
