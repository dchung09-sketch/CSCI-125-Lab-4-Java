/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Problem 3: Print even numbers up to N
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob3 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Please enter any positive or negative number from any range of your choice to be labeled as N and printed the even numbers up to N.");// The output of the code is being printed in the green text
        int userselectedinputN = scanner.nextInt();// integer value is stored at 'userselectedinputN'
        System.out.println("The amount of even numbers within the range of 1 and (N) the number that you chose which is " + userselectedinputN + " are: ");//The output of the code is being printed in the green text with the integer value
        for (int even = 2; even <= userselectedinputN; even += 2) {// This code effectively generating all even numbers starting from 2 up to userselectedinputN.
            System.out.print(even + " ");// The output of the code would print all of the even numbers
        }// This closes the loop increment statement
        scanner.close();// The scanner is being prompted to close
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created