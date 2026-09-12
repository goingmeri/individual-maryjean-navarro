package com.joysistvi.stage2.discussion.day21.Activity14_Navarro;

public class RegularEmployee extends Employee {
    private static final double ATTENDANCE_BONUS = 1000;

    public RegularEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + ATTENDANCE_BONUS;
    }

    @Override
    public String getEmployeeType() {
        return "Regular Employee";
    }
}