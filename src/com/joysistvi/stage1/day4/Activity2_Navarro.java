package com.joysistvi.stage1.day3;

public class Activity2_Navarro {
    public static void main (String[] args){
        // Given values
        double income = 50000;
        double foodAllowance = 15000;
        double transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;
        // Calculate percentage of each expense relative to total income
        double foodPercentage = (foodAllowance / income) * 100;
        double transportationPercentage = (transportation / income) * 100;
        double rentPercentage = (rent / income) * 100;
        double utilityBillPercentage = (utilityBill / income) * 100;

        // Calculate total expenses and remaining balance
        double totalExpenses = foodAllowance + transportation + rent + utilityBill;
        double remainingBalance = income - totalExpenses;

        // Display results
        System.out.println("===== MONTHLY BUDGET BREAKDOWN =====");
        System.out.printf("Total Income: PHP %.2f%n", income);
        System.out.println("-------------------------------------");
        System.out.printf("Food Allowance: PHP %.2f (%.1f %%)%n", foodAllowance, foodPercentage);
        System.out.printf("Transportation: PHP %.2f (%.1f %%)%n", transportation, transportationPercentage);
        System.out.printf("Rent: PHP %.2f (%.1f %%)%n", rent, rentPercentage);
        System.out.printf("Utility Bill: PHP %.2f (%.1f %%)%n", utilityBill, utilityBillPercentage);
        System.out.println("-------------------------------------");
        System.out.printf("Total Expenses: PHP %.2f%n", totalExpenses);
        System.out.printf("Remaining Balance: PHP %.2f%n", remainingBalance);
        System.out.println("=====================================");
    }
}
