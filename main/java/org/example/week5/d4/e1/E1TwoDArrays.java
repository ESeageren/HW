package org.example.week5.d4.e1;

public class E1TwoDArrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] numbers = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Use Nested for loop to print each element of the array in the matrix form
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }


}}
