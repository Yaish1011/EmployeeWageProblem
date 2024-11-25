package com.employeewage;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");


        final int WAGE_PER_HOUR = 20;    // Wage per hour
        final int FULL_DAY_HOURS = 8;   // Full day working hours



        Random random = new Random();
        // 0 for absent, 1 for present
        int attendance = random.nextInt(2);

        if (attendance == 1) {
            int dailyWage = FULL_DAY_HOURS * WAGE_PER_HOUR;
            System.out.println("Employee is Present.");
            System.out.println("Daily Employee Wage: $" + dailyWage);

        } else {
            System.out.println("Employee is Absent.");
            System.out.println("Daily Employee Wage: $0");

        }
    }
}