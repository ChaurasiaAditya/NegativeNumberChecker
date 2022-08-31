package com.aditya;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create an object for NegativeNumberChecker class
        NegativeNumberChecker negativeNumberChecker = new NegativeNumberChecker();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Read the number from the user
        System.out.println("Please enter a number to check: ");
        int number = scanner.nextInt();

        // store the result in a boolean variable
        boolean isNegativeNumber = negativeNumberChecker.isNegativeNumber(number);

        // print the result
        System.out.println("Is " + number + " a negative number? " + isNegativeNumber);

        // close the scanner object
        scanner.close();

    }
}