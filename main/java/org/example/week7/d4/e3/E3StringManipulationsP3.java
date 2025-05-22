package org.example.week7.d4.e3;

public class E3StringManipulationsP3 {
    public static void main(String[] args) {
        // Step 1: Declare and Assign a String Variable
        String productCode="KX125";

// Step 2: Use the `charAt()` Method to Analyze the Product Code
        char firstChar=productCode.charAt(0);

        if (productCode.startsWith("K")){
            System.out.println("Product code starts with 'K': true");
        }else{
            System.out.println("Product code starts with 'K': false");}

        char lastChar=productCode.charAt(4);

        if (productCode.endsWith("5")){
            System.out.println("Product code ends with '5': true");
        }else{
            System.out.println("Product code ends with '5': false");}



// Extract the first character of `productCode`
// Check if the first character is the letter 'K'
// Extract the last character of `productCode`
// Check if the last character is a digit '5'



    }
}
