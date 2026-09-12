package com.joysistvi.stage2.discussion.day21.Activity14_Navarro;

public class ManagerEmployee extends Employee {
    private static final double ALLOWANCE = 5000;

    public ManagerEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double computeSalary() {
        return baseSalary + ALLOWANCE;
    }

    @Override
    public String getEmployeeType() {
        return "Manager Employee";
    }
}