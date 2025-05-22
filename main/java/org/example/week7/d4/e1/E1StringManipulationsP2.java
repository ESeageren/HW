package org.example.week7.d4.e1;

public class E1StringManipulationsP2 {
    public static void main(String[] args) {
    // Step 1: Create String Variables
    // - Create a String variable named 's1' and assign it the value "Hello".
        String s1="Hello";
    // - Create a String variable named 's2' and assign it an empty string "".
        String s2="";
    // - Create a String variable named 's3' and assign it the value "   " (a string with three spaces).
        String s3="   ";
    // - Also, create a String variable named 'text' and assign it the value "   LearnJava   " (with extra spaces).
        String text="    LearnJava     ";

    // Step 2: Check if the Strings are Empty
    // - Use the isEmpty() method on s1, s2, and s3 to determine if they are empty.
        if (s1.isEmpty()) {
            System.out.println("Is s1 empty? true");
        } else {
            System.out.println("Is s1 empty? false");
        }
        if (s2.isEmpty()) {
            System.out.println("Is s2 empty? true");
        } else {
            System.out.println("Is s2 empty? false");
        }
        if (s3.isEmpty()) {
            System.out.println("Is s3 empty? true");
        } else {
            System.out.println("Is s3 empty? false");
        }

    // Step 3: Trim the String
    // - Use the trim() method on the variable 'text' to remove the leading and trailing spaces.
        System.out.println(text.trim());

    // Step 4: Print the Results
    // - Print the results of the isEmpty() checks for s1, s2, and s3.
    // - Print the trimmed result of the 'text' variable.


    }
}
