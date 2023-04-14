package org.yearup;300

import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the loan amount from the user
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();

        // Get the interest rate from the user
        System.out.print("Enter the interest rate: ");
        double interestRate = scanner.nextDouble();

        // Get the loan term in years from the user
        System.out.print("Enter the loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        // Convert the loan term to months
        int loanTermMonths = loanTermYears * 12;

        // Calculate the monthly interest rate
        double monthlyInterestRate = interestRate / 1200;

        // Calculate the monthly mortgage payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));




        // Display the monthly mortgage payment and interest rate to the user
        System.out.printf("Your monthly mortgage payment is: $%.2f", monthlyPayment);
        System.out.println();
        System.out.printf("Your monthly interest rate is: $%.2f", interestRate * 12 );
        System.out.println();
        System.out.println("---------------------------------");
       // Display the total loan amount with interest




    }

}


