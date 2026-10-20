/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Problem 4: Sum of natural numbers
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob4 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Please enter any positive or negative number of your choice to find its sum of natural numbers within that range: ");// The output of the code in printed within the green text
        int userselectedinputN = scanner.nextInt();// there is an integer value stored at the variable userslectednumberN
        int naturalnumsum = 0; // the integer naturalnumsum is set equal to 0
        for (int even = 2; even <= userselectedinputN; even += 2) { // a loop statement effectively iterating through all even integers from 2 to userselectedinputN.
            naturalnumsum += even; // Corrected to add 'even' instead of 'initialnumber'
        }// end of loop
        System.out.println("The overall sum of natural numbers ranging from 1 to " + userselectedinputN + " is set equal to " + naturalnumsum);// the output of the code is the green text
        scanner.close();// the scanner is being prompted to close

    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created
