/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Problem 2: Simple Calculator
Good evening Professor, on line 23, the cod eis showing the word 'operation' in red indicating that it might not work, but code was originally working when I had initially wrote it. Could you please let me know what I did wrong so I could correct it next time I would really appreciate it!
 */

import java.util.Scanner;// This is the starting base for various objects/blueprints
public class DanielChung_Prob2 {// This class is the starting design for creating various code

    public static void main(String[] args) {// This is the JavaScript entry level code to create strings as arguments
        Scanner scanner = new Scanner(System.in);// This is a new scanner object that is able to read inputs
        System.out.println("Please enter the first number of your choice from any range possible:");// The output is printed in green text
        int userint1 = scanner.nextInt();// The integer value is stored between the label "userint1"
        System.out.println("Please enter the second number of your choice from any range possible");// The output of the code is printed in the green tet
        int userint2 = scanner.nextInt();// The integer value is stored between the label "userint2"
        System.out.println("Now enter the type of mathematical operation that you would like to calculate: addition, subtraction, multiplication and division (+, -, *, /): ");// The output is printed in the green text
        // This code reads the first character of the user's input and stores it in the variable operation
        int outcome = 0;// The variable 'outcome' interger is stored at 0
        boolean integermath = true;// The boolean case for the variable 'integermath' is set to be equal at true
        switch (operation) {// This is the starting of a switch statement
            case '+':// This is the case for addition
                outcome = userint1 + userint2;// The result would be the addition of userint1 and userint2
                break;// this ends the operation
            case '-':// This is the case for subtraction
                outcome = userint1 - userint2;// The result would be userint1 subtracted by userint2
                break;// This ends the operation
            case '*':// This is the case for multiplication
                outcome = userint1  *  userint2;// The result would be userint1 multiplied by userint2
                break;// This break would end the currect operation
            case '/':// This is the case for division
                    if (userint2 <= 0) {// This is an if statement deciding if userint2 is less than or equal to 0
                        System.out.println("The calculator cannot divide these numbers because any number divided by zero is automatically zero");// This is the output of the code which is highlighted in green
                    } else {// This is the start of an else statement
                        outcome = userint1 / userint2;// The result would be userint1 divided by userint2
                    }// This marks the end of the else statement
                break;// This is the break for ending the case
            default:// If no cases are have met the requirements, the dault action would occur
                System.out.println("The operation symbol/ variable that you have entered is not legible. Please use one of the following operations: (+, -, *, /). ");// The output is printed in green text
                integermath = false;// The boolean statement would be defult to return to being false
        }// This ends the sequence for all cases
        if (integermath) {// This is an if statment idenfitying the variable 'integermath'
            System.out.println("The result of the mathematical operation chosen is " + outcome);// The output of the code would be in green plus the variable placeholder of 'outcome'
        }// This closes the if statement
        scanner.close();// The scanner is prompted to be closed

    }// This is the end block of code for the "public static void main(String[] args)" statement
}//This is the end block of code for the "public class Main" blueprint code that was created