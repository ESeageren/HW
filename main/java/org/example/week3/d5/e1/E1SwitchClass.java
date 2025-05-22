package org.example.week3.d5.e1;

import java.util.Scanner;

public class E1SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of the instructor");
        String instructorName = input.next();

        switch (instructorName) {
            case
                    "Asghar":
                System.out.println("Will take care of Java Assignment");
                break;
            case
                    "Sohail":
                System.out.println("Will take care of SDLC Assignment");
                break;
            case
                    "Weqas":
                System.out.println("Will take care of Selenium Assignment");
                break;
            case
                    "Asel":
                System.out.println("Will take care of every Assignment");
                break;
            case
                    "Moazzam":
                System.out.println("Will take care of Selenium Assignment");
            break;
            default:
                System.out.println("Invalid instructor selected");

        }
        input.close();
        // Print prompt for user to enter the name of the instructor
        // Capture the instructor name input

        // Determine the responsibility based on the instructor's name using a switch statement


        // Print the responsibility



    }
}
