package com.employeewage;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");


        Random random = new Random();
        // 0 for absent, 1 for present
        int attendance = random.nextInt(2);

        if (attendance == 1) {
            System.out.println("Employee is Present.");
        } else {
            System.out.println("Employee is Absent.");
        }
    }
}