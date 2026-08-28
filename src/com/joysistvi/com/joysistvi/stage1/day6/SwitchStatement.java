package com.joysistvi.stage1.day6;

public class SwitchStatement {

    public static void main(String[] args){
        String month = "March";

        switch (month) {
            case "January":
            case "February":
            case "March":
                System.out.println("First Quarter of the year.");
                break;
            case "April":
            case "May":
            case "June":
                System.out.println("Second Quarter of the year.");
                break;
            case "July":
            case "August":
            case "September":
                System.out.println("Third Quarter of the year.");
                break;
            case "October":
            case "November":
            case "December":
                System.out.println("Fourth Quarter of the year.");
                break;
            default:
                System.out.println("Invalid input! Please enter a valid month: ");
        }
    }
}
