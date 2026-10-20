# Java Control Flow: Switch Statements and Loops

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This collection contains five Java console exercises focused on selection and repetition. The programs explore day-of-week selection, a basic calculator, even-number generation, summation, and multiplication tables.

These coursework examples demonstrate how switch statements and for loops control program execution. The supplied source includes several issues documented below.

## Programs

| Uploaded File | Purpose |
|---------------|---------|
| `DanielChung_Prob1-1.java` | Maps numbers 1–7 to days of the week using a switch statement. |
| `DanielChung_Prob2-1.java` | Implements the structure of an integer calculator with addition, subtraction, multiplication, and division. |
| `DanielChung_Prob3-1.java` | Prints positive even numbers from 2 through a user-entered upper limit. |
| `DanielChung_Prob4-1.java` | Currently sums positive even numbers through a user-entered upper limit, despite being labeled as a natural-number sum. |
| `DanielChung_Prob5-1.java` | Prints a multiplication table for an entered integer using factors 1–20. |

## Concepts Practiced

- Console input using `Scanner`
- Integer and Boolean variables
- Switch statements with `case`, `break`, and `default`
- Conditional statements
- For loops
- Arithmetic operators
- Incrementing loop counters
- Accumulating a running total
- Console output and string concatenation

## Program Details

### 1. Day of the Week

Uses this mapping:

| Input | Day |
|-------|-----|
| 1 | Sunday |
| 2 | Monday |
| 3 | Tuesday |
| 4 | Wednesday |
| 5 | Thursday |
| 6 | Friday |
| 7 | Saturday |

Other integer values produce an out-of-range message.

**Known issue:** Case 5 is missing a `break;`, so entering 5 prints both the Thursday and Friday messages. Add `break;` after the Thursday output.

### 2. Simple Calculator

The calculator is designed to accept two integers and an operation symbol: `+`, `-`, `*`, or `/`.

**Required compilation fix:** The variable `operation` is used but never declared. Add the following after the operation prompt and before the switch statement:

```java
char operation = scanner.next().charAt(0);
```

**Division issues to correct:**

- Change `userint2 <= 0` to `userint2 == 0` so negative divisors are allowed.
- Replace the error message with `Cannot divide by zero.` Division by zero is undefined, not zero.
- Set `integermath = false;` in the zero-divisor branch so the program does not also print a misleading result of zero.

Division uses integer arithmetic, so `7 / 2` produces `3`.

### 3. Even Numbers up to N

Uses a for loop starting at 2 and increasing by 2 to display positive even numbers no greater than N.

For example, entering `10` prints:

```text
2 4 6 8 10
```

For values below 2, no numbers are printed.

### 4. Summation

The current loop adds only positive even numbers:

```text
2 + 4 + 6 + ... up to N
```

For example, entering `10` produces `30`.

Although the program's messages describe a sum of natural numbers, the implementation does not include odd numbers. To calculate all natural numbers from 1 through N, replace the loop with:

```java
for (int number = 1; number <= userselectedinputN; number++) {
    naturalnumsum += number;
}
```

With this correction, entering `10` produces `55`. The current program returns `0` for inputs below 2.

### 5. Multiplication Table

Reads an integer and prints its products with factors from 1 through 20.

For example, entering `5` generates results from:

```text
5 × 1 = 5
```

through:

```text
5 × 20 = 100
```

The actual console output uses full sentences to describe each multiplication.

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Prepare the Filenames

Java filenames must match their public class names. Rename the uploaded files as follows:

| Uploaded Filename | Required Filename |
|-------------------|-------------------|
| `DanielChung_Prob1-1.java` | `DanielChung_Prob1.java` |
| `DanielChung_Prob2-1.java` | `DanielChung_Prob2.java` |
| `DanielChung_Prob3-1.java` | `DanielChung_Prob3.java` |
| `DanielChung_Prob4-1.java` | `DanielChung_Prob4.java` |
| `DanielChung_Prob5-1.java` | `Main.java` |

The fifth program declares `public class Main`, so its filename must be `Main.java`.

Keep this collection in its own folder because other exercise sets may reuse the same class names.

### Compile and Run

After renaming the files and adding the missing `operation` declaration in Program 2, compile:

```sh
javac DanielChung_Prob1.java DanielChung_Prob2.java DanielChung_Prob3.java DanielChung_Prob4.java Main.java
```

Run the desired program individually:

```sh
java DanielChung_Prob1
java DanielChung_Prob2
java DanielChung_Prob3
java DanielChung_Prob4
java Main
```

Each command starts a separate program. Follow its prompts to enter input.

## Current Limitations

- Non-integer numeric input is not handled with exception handling.
- Programs do not repeatedly prompt users after invalid entries.
- Negative upper limits do not generate negative-number sequences.
- Large inputs can cause integer overflow or lengthy output.
- The calculator requires the compilation and division fixes described above.

## Learning Objective

Practice translating selection rules and repeated calculations into Java code using switch statements, conditional logic, and loops.
