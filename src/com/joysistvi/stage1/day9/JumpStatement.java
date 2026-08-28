package com.joysistvi.stage1.day9;

public class JumpStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5 || i == 8 || i == 10) {
                continue;
            }
            System.out.println(i);
        }
    }
}
