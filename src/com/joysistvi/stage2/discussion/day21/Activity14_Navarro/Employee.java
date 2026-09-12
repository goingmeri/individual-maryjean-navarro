package com.joysistvi.stage2.discussion.day21.Activity14_Navarro;

public class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {
        return baseSalary;
    }

    public double computeSalary(double taxRate) {
        return computeSalary() * (1 - taxRate);
    }

    public String getEmployeeType() {
        return "Employee";
    }

    public void printPayslip() {
        System.out.println(name + "'s salary: " + computeSalary());
    }
}