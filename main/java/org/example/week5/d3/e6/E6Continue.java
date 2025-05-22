package org.example.week5.d3.e6;

public class E6Continue {
    public static void main(String[] args) {

        // Enhanced for loop to iterate through the items
       String [] items = {"Item1", "Out of Stock", "Item2", "Item3", "Out of Stock", "Item4"};

        // If the current item is "Out of Stock", skip the current iteration using continue

        // If the item is in stock, print the message for processing the item
        for (String status : items){
          if (status == "Out of Stock"){
              continue;
          }
            System.out.println("Processing " + status);
        }



    }
}
