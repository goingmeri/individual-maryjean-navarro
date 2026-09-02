package com.joysistvi.stage1.day11;

public class PresentationExample {
        public static void main(String[] args) {
            String word = "Code";

            // Convert string to a character array
            char[] chars = word.toCharArray();

            // Output array elements: ['C', 'o', 'd', 'e']
            System.out.println("Array elements:");
            for (int i = 0; i < chars.length; i++) {
                System.out.println("Index " + i + ": " + chars[i]);
            }
        }

}
