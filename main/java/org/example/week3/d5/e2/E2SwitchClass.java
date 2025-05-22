package org.example.week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {
        // No comments are provided here, so you can write the code independently.
        // If you encounter issues, review the previous exercises.
        // Re-watch the recorded videos on "switch statements".
        // If you continue facing issues, please ask the Technical Support team.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType= scanner.nextInt();
        switch (mealType) {
            case 1:
                System.out.println("The price of your meal is $5.0");
                break;
            case 2:
                System.out.println("The price of your meal is $10.0");
                break;
            case 3:
                System.out.println("The price of your meal is $15.0");
                break;
            default:
                System.out.println("Invalid meal type entered");
        break;





        }




    }}

