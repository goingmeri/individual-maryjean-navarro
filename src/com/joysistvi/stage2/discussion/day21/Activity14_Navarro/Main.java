package com.joysistvi.stage2.discussion.day21.Activity14_Navarro;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new RegularEmployee("Ana", 15000),
                new SalesEmployee("Ben", 12000, 5000),
                new ContractualEmployee("Cruz", 160, 75),
                new ManagerEmployee("Dela Cruz", 20000)
        };

        for (Employee e : employees) {
            e.printPayslip();
            System.out.println("  Type: " + e.getEmployeeType());
            System.out.println("  After 10% tax: " + e.computeSalary(0.10));
        }
    }
}