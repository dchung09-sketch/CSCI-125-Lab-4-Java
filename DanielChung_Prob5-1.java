/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Problem 5: Multiplication Tables
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class Main {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
    System.out.println("Please enter a number value of your choice to thus show the multiplication table of the Integer Selected!");// The output of the code is the text highlighted in green
    int multiplicationnumberN = scanner.nextInt();// the integer value is stored at the variable 'multiplicationnumberN'
System.out.println("Here is the final Multiplication table for Integer Number " + multiplicationnumberN );// The output of the code is the green text with the integer value of the variable
        for (int factor = 1; factor <= 20; factor++) {// this creates a loop effectively iterating through all integers from 1 to 20.
    int result = multiplicationnumberN * factor;// the result of the integers would be the first variable multiplied by the 'factor' integer
            System.out.println("The number " + multiplicationnumberN + " is being multiplied by the number " + factor + " which would then lead to the numerical result: " + result);// The output of the code is the text in the green with the integer value as variables
        }// This is the end for the loop statements


        scanner.close();// The scanner is beijg prompted to close
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created