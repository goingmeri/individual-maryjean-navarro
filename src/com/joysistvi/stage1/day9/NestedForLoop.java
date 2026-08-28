package com.joysistvi.stage1.day9;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                int product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }
            System.out.println();
        }
    }
}
