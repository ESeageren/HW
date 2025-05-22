package org.example.week5.d3.e4;

public class E4Break {
    public static void main(String[] args) {

        // Declare and initialize an array with items on the production line
        String [] items = {"Item1", "Item2", "Defective", "Item3", "Item4"};

        // Enhanced for loop to iterate through the items
            for (String itemStatus : items){

        // If the current item is "Defective", print the message and break the loop
            if (itemStatus == "Defective") {
                System.out.println("Defective item found. Stopping the production line.");
                break;
            }
                System.out.println("Processing " + itemStatus);

        // If the item is not defective, print the message for processing the item
    }
}}
