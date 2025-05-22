package org.example.week3.d4.e1;

public class E1LogicalOperators {
    public static void main(String[] args) {

// Loan Eligibility Checker - Step-by-Step Guide
// Step 1: Define your variables.
//   - Create a boolean variable 'needsLoan' to indicate if the person needs a loan.
        boolean needsLoan = true;
//   - Create an int variable 'creditScore' to store the person's credit score.
        int creditScore = 750;
// Step 2: Check Loan Eligibility using the logical && operator.
        if (needsLoan=true && creditScore>700) {
            System.out.println("The eligibility is Eligible");
        }else {
            System.out.println("The eligibility is not Eligible");}
//   - If both conditions are met, print: "The eligibility is Eligible".
//   - Otherwise, print: "The eligibility is Not eligible".


    }
}