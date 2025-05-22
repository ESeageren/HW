package org.example.week4.d4.e8;

import java.util.Scanner;

public class E8ForLoop {
    public static void main(String[] args) {
        // Heads up! This can be a bit tricky.
        // Create a Scanner object to read input from the console
        Scanner scanner=new Scanner(System.in);
        // Prompt the user to enter a value for x
        System.out.print("In: ");
        int x= scanner.nextInt();
        // Use a for loop that starts with i = x - 1 and continues while i >= 0
        for (int i=x-1; i>=0; i--){
            System.out.print(i + " ");
        }
        // Inside the loop, print the value of i followed by a space

    }
}