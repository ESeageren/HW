package org.example.week3.d4.e2;

import java.util.Scanner;

public class E2LogicalOperators {
    public static void main(String[] args) {

// Personal Budgeting Helper - Step-by-Step Guide
//
// Step 1: Create a Scanner object.
        Scanner scanner=new Scanner(System.in);
// Step 2: Capture Monthly Expenses.
//   - Ask the user for their monthly rent expense and store it in a variable 'rentExpense'.
        System.out.println("Please enter your monthly rent expense");
        int rentExpense = scanner.nextInt();
//   - Ask for the monthly food expense and store it in 'foodExpense'.
        System.out.println("Please enter your monthly food expense");
        int foodExpense = scanner.nextInt();
//   - Ask for the monthly transportation expense and store it in 'transportationExpense'.
        System.out.println("Please enter your monthly transportation expense");
       int transportationExpense = scanner.nextInt();
//   - Ask for the monthly entertainment expense and store it in 'entertainmentExpense'.
        System.out.println("Please enter your monthly entertainment expense");
       int entertainmentExpense = scanner.nextInt();
//
// Step 3: Analyze Expenses Using Logical &&.
//   - Use an if-else statement with the && operator to compare expenses.
        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        }else {
            System.out.println("You need to rethink your spending priorities.");
        }
//   - If rentExpense is greater than foodExpense AND transportationExpense is greater than entertainmentExpense:
//       - Print: "You are prioritizing essentials well."
//   - Else:
//       - Print: "You need to rethink your spending priorities."
//
// Reminder:
//   - Write your code step by step, and test it to see that the output matches the expected results.

    }
}
