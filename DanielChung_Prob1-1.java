/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Probelm 1: Day of the Week
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob1{// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Please select any number from the ranges of 1 through 7.");// The output of the code is printed in green text
        int numinitializingdayofweek = scanner.nextInt();// the variable 'numinitialdayofweek' is holding an integer value
        switch (numinitializingdayofweek) {// This the start of a switch statement
            case 1:// This is the start of case 1
                System.out.println("The Number Chosen: " + numinitializingdayofweek + " represents the first day of the week which is Sunday!");//The output of the code is printed in green text with the variable integer value
                break;// This ends the first case
            case 2:// the start of the second case
                System.out.println("The Number Chosen: " + numinitializingdayofweek +" represents the second day of the wekk which is Monday!");//The output of the code is printed in green text with the variable integer value
                break;// This is the end of the second case
            case 3:// this is the start of the third case
                System.out.println("The Number Chosen: " + numinitializingdayofweek +" represents the third day of the week which is Tuesday!");//The output of the code is printed in green text with the variable integer value
                break;// the end of the third case
            case 4:// start of the fourth case
                System.out.println("The Number Chosen: " + numinitializingdayofweek +" represents the fourth day of the week which is Wednesday!");//The output of the code is printed in green text with the variable integer value
                break;// end of the fourth case
            case 5:// start of the fifth case
                System.out.println("The Number Chosen: " + numinitializingdayofweek +" represents the fifth day of the week which is Thursday!");//The output of the code is printed in green text with the variable integer value
            case 6:// start of the sixth case
                System.out.println("The Number Chosen: " + numinitializingdayofweek + " represents the sixth day of the week which is Friday!(the best day of the week in my opinion)");//The output of the code is printed in green text with the variable integer value
                break;// this is the end of the case six
            case 7:// the start of the case seven
                System.out.println("The Number Chosen: " + numinitializingdayofweek +" represents the seventh day of the week which is Saturday!");//The output of the code is printed in green text with the variable integer value
                break;// the end if the seventh case
            default:// if no integer values don't meet any of the cases, the default action would occur
                System.out.println("The Number you have Chosen isn't between the ranges of 1 through 7, please select any number from the range of 1 through 7.");//The output of the code is printed in green text with the variable integer value
        }// this is the end for all cases
        scanner.close();// the scanner is being prompted to close
    }//This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created



