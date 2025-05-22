package org.example.week5.d3.e3;

public class E3Break {
    public static void main(String[] args) {
        // Declare and initialize an array with temperature readings in Celsius
        double[] temperatures = {36.5, 37.0, 37.5, 38.0, 39.5, 40.0, 40.5};

        // Enhanced for loop to iterate through temperature readings
        for (double readings : temperatures) {
            if (readings >= 39.5) {
                System.out.println("Critical temperature reached: "+ readings +"°C. Stopping monitoring.");
                break;
            }
            // If the current temperature is greater than or equal to 39.5, print the critical message and break the loop

            System.out.println("Temperature is normal: " + readings + "°C");
        }
        // Print the normal temperature message for readings before the break condition is met
    }}