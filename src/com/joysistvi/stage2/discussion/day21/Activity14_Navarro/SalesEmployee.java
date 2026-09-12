package com.joysistvi.stage2.discussion.day21.Activity14_Navarro;

public class SalesEmployee extends Employee {
    private double commission;

    public SalesEmployee(String name, double baseSalary, double commission) {
        super(name, baseSalary);
        this.commission = commission;
    }

    @Override
    public double computeSalary() {
        return baseSalary + commission;
    }

    @Override
    public String getEmployeeType() {
        return "Sales Employee";
    }
}