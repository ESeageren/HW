package org.example.week3.d4.e4;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {

// Weekend Subject Planner
//
// Step 1: Create a Scanner object.
        Scanner scanner=new Scanner(System.in);
// Step 2: Capture Boolean Inputs.
//   - Ask the user: "Is it weekend? (true/false)"
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend= scanner.nextBoolean();

//   - Ask the user: "Are you available? (true/false)"
        System.out.println("Are you available? (true/false)");
        boolean isAvailable= scanner.nextBoolean();


// Step 3: Determine the Subject to Study.
//   - Use a else if conditional statement to decide which subject to assign:
//       - If 'isWeekend' is true AND 'isAvailable' is true, set the subject to "Java".
        if (isWeekend && isAvailable) {
            System.out.println("Today you will be learning Java");
        } else if (!isWeekend && isAvailable) {
            System.out.println("Today you will be learning manual testing");
        }else {
            boolean b = !isAvailable && isWeekend;
            {
            System.out.println("Today you will be learning no subject");}

        }
//       - If 'isWeekend' is false AND 'isAvailable' is true, set the subject to "manual testing".
//       - If 'isAvailable' is false (regardless of whether it's the weekend), set the subject to "no subject".
//
// Step 4: Print the Subject.
//   - Display the message: "Today you will be learning " followed by the determined subject.
//
// Reminder:
//   - Write your code step by step and test each part to ensure the output matches the expected results.


    }
}