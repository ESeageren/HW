package org.example.week3.d3.e2;

public class E2NestedIfElse {
    public static void main(String[] args) {


// Step 1: Declare the required variables.
//   - Declare an integer variable named 'age' and assign it a value (e.g., 16).
        int age=16;
//   - Declare a boolean variable named 'isStudent' and assign it a value (e.g., true).
        boolean isStudent=true;

//
// Step 2: Check Age Eligibility for Discount.
//   - Write an if-else statement to check if 'age' is less than 18.
        if (age<18) {
//   - If 'age' is less than 18, print: "You qualify for an age-based discount."
            System.out.println("You qualify for an age-based discount.");
//   - If 'age' is not less than 18, move to the next step inside the else block.
        }else {
//
// Step 3: Nested Student Status Check.
//   - Inside the else block from Step 2, add another if-else statement.
//   - Check if 'isStudent' is true.
//       - If it is true, print: "You qualify for a student discount."
            if (isStudent) {
                System.out.println("You qualify for a student discount.");
            }
//       - Otherwise, print: "You do not qualify for a discount."
        else {
            System.out.println("You do not qualify for a discount.");}
//
// Reminder:
//   - Use proper indentation to make the nested structure clear.
//   - Try to write the code yourself using these guidelines instead of copying everything.



    }
}}
